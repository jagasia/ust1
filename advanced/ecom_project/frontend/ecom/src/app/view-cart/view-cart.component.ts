import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {
  carts:any;
  user:any;
  constructor(private cs:CartService, private router:Router) { }

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
  

}
