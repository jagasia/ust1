import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-customer-product',
  templateUrl: './customer-product.component.html',
  styleUrls: ['./customer-product.component.css'],
})
export class CustomerProductComponent implements OnInit{
  products: any;
  view:any;
  arr:number[]=[];
  perPage:number=5;
  noOfPages=0;
  user: any;
  toggle: boolean = false;
  arrow:string='';
  constructor(
    private ps: ProductService,
    private router: Router,
    private cs: CartService
  ) {
    
  }
  ngOnInit(): void {
    
    var str = <any>localStorage.getItem('user');
    this.user = JSON.parse(str);
    if (this.user.role != 'customer') {
      this.router.navigate(['404']);
    }
    this.ps.fnGetAllProducts().subscribe((data) => {
      this.products = data;
      //find how many pages are there. (per page =5)
      this.noOfPages=Math.ceil(this.products.length/this.perPage);
      for(var i=1;i<=this.noOfPages;i++)
        this.arr.push(i)

        this.fnShowPage(1);
    });
    
  }

  fnAddToCart(id: any) {
    var product: any;
    this.ps.findProductById(id).subscribe((data) => {
      // alert(JSON.stringify(data))
      product = data;
      var user = this.user;
      var quantity = 1;
      var cart = { user: user, product: product, quantity: quantity };
      // alert(JSON.stringify(cart))
      this.cs.fnAddToCart(cart).subscribe((data) => {
        alert(JSON.stringify(data));
      });
    });
    // alert(JSON.stringify(product))
  }

  

  fnSort(field: string) {
    
    
    this.products.sort((a: any, b: any) => {
      var x: any;
      var y: any;
      switch (field) {
        case 'id':
          x = a.id;
          y = b.id;

          if (this.toggle) {
            return x - y;
          } else {
            return y - x;
          }
          break;
        case 'price':
          x = a.price;
          y = b.price;

          if (this.toggle) {
            return x - y;
          } else {
            return y - x;
          }
          break;
        case 'name':
          x = <string>a.name.toUpperCase();
          y = <string>b.name.toUpperCase();
          break;
        case 'description':
          x = <string>a.description.toUpperCase();
          y = <string>b.description.toUpperCase();
          break;
        case 'category':
          x = <string>a.category;
          y = <string>b.category;
          break;
        case 'user':
          x = <string>a.user.name;
          y = <string>b.user.name;
          break;
          case 'keywords':
          x = <string>a.keywords;
          y = <string>b.keywords;
          break;
      }
      if (this.toggle) {
        return x.localeCompare(y);
      } else {
        return y.localeCompare(x);
      }
      console.log(this.products);
      // alert(x - y);
    });
    // console.log(this.products);
    this.toggle = !this.toggle;
  }

  fnShowPage(i:number)
  {
    // alert(i)
    var startIndex=(i-1)*this.perPage;
    this.view=this.products;
    this.view=[];
    for(var i=startIndex;i<(startIndex+this.perPage) && i<this.products.length;i++)
    {
      
      this.view.push(this.products[i]);
    }
    console.log(this.view)
  }
}

