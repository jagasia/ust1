import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productForm:any;
  products:Product[]=[];

  constructor(private fb:FormBuilder) { 
    this.productForm=this.fb.group(
      {
        id:[''],
        name:[''],
        price:['']
      }
    );
  }

  ngOnInit(): void {
  }

  fnAdd()
  {
    // alert(JSON.stringify(this.productForm.value));
    var product=this.productForm.value;
    this.products.push(product);
    console.log(this.products);
  }
}
