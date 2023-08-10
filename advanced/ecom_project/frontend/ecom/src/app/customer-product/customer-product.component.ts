import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../cart.service';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-customer-product',
  templateUrl: './customer-product.component.html',
  styleUrls: ['./customer-product.component.css'],
})
export class CustomerProductComponent implements OnInit {
  products: any;
  user: any;

  constructor(
    private ps: ProductService,
    private router: Router,
    private cs: CartService
  ) {}
  ngOnInit(): void {
    var str = <any>localStorage.getItem('user');
    this.user = JSON.parse(str);
    if (this.user.role != 'customer') {
      this.router.navigate(['404']);
    }
    this.ps.fnGetAllProducts().subscribe((data) => {
      this.products = data;
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

  toggle: boolean = false;

  fnSort(field: string) {
    this.products.sort((a: any, b: any) => {
      this.toggle = !this.toggle;
      var x: any;
      var y: any;
      
      switch (field) {
        
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
          x =<string>a.name;
          y =<string>b.name;
        break;
        case 'description':

          x =<string>a.description;
          y =<string>b.description;
          
         
          break;
      }
      if (this.toggle) {
        return x.localeCompare(y);
      } else {
        return y.localeCompare(x);
      }
      console.log(this.products)
      // alert(x - y);

    });
    console.log(this.products);
  }
}
