import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {
  carts:any;
  user:any;
  constructor(private cs:CartService, private router:Router, private os:OrderService) { }

  ngOnInit(): void {
    var str = <any>localStorage.getItem('user');
    this.user = JSON.parse(str);
    if (this.user.role != 'customer') {
      this.router.navigate(['404']);
    }
    this.cs.fnFindCartsByUser(this.user).subscribe((data)=>{
      this.carts=data;
      console.log(this.carts);
    });
  }

  fnUpdate(index:number)
  {
    var id=this.carts[index].id;
    this.cs.fnUpdateCart(this.carts[index]).subscribe((data)=>{
      if(data!=null)
        this.carts[index]=data;
      else
        alert("Something went wrong")
    });
  }

  fnPlus(index:number)
  {
    var id=this.carts[index].id;
    this.carts[index].quantity++;
    this.fnUpdate(index);
  }

  fnMinus(index:number)
  {
    var id=this.carts[index].id;
    if(this.carts[index].quantity>1)
    {
      this.carts[index].quantity--;
      this.fnUpdate(index);
    }else
    {
      this.cs.fnDeleteCart(id).subscribe((data)=>{
        if(data!=null)
        {
          this.cs.fnFindCartsByUser(this.user).subscribe((data)=>{
            this.carts=data;
          });
        }
      })
    }
  }
  
  fnPlaceOrder()
  {
    var orderId=0;
    this.os.fnGenerateOrderid().subscribe((data)=>{
      orderId=<number><any>data;
      // alert(orderId)
      for(let cart of this.carts)
      {
        //for every cart item, we add an order item. All shall have same orderId
          // alert(JSON.stringify(cart));
          var order={"orderId":orderId,"orderDate":new Date(), "customer":cart.user,"product":null,"quantity":0,"shippingAddress":''};
          order.orderId=orderId;
          order.product=cart.product;
          order.quantity=cart.quantity;
          console.log(order);
        this.os.fnAddOrder(order).subscribe((data)=>{
          console.log(data);
          //now, delete this cart item
          this.cs.fnDeleteCart(cart.id).subscribe((data)=>{
            console.log("cart id:"+cart.id+" deleted")
          });
        },(error)=>{});
      }
      
    });

    
  }

}
