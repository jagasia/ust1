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
  products:Product[]=[
    {id:1,name:'Pencil',price:12},
    {id:2,name:'Penc',price:22},
    {id:3,name:'Sharpner',price:33}    
  ];

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

  fnDelete(id:number)
  {
// alert(id)
    var temp:Product[]=[];
    for(var x of this.products)
    {
      if(x.id!=id)
        temp.push(x);
    }
    this.products=temp;
  }

  fnSelect(id:number)
  {
    
    //how to patch an object to a reactive form?
    // console.log(id);
    for(let p of this.products)
    {
      var product:any;
      if(p.id==id)
      {
        // console.log("Found");
        // console.log(p);
        product=p;
      }
    }
    // console.log(product);
    
    this.productForm.patchValue(product);
  }
}
