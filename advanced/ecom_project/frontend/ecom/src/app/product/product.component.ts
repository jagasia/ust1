import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  productForm:any;
  products:any;
  constructor(private fb:FormBuilder, private ps:ProductService) { 
    this.productForm=this.fb.group({
      "id":[],
      "name":[],
      "description":[],
      "price":[],
      "category":[],
      "keywords":[]
    });
  }

  ngOnInit(): void {
    this.ps.fnGetAllProducts().subscribe((data)=>{
      this.products=data;
    });
  }

}
