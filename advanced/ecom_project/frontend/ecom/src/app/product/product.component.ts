import { Component, DoCheck, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit, DoCheck {
  productForm:any;
  products:any;
  constructor(private fb:FormBuilder, private ps:ProductService, private router:Router) { 
    this.productForm=this.fb.group({
      "id":[],
      "name":[],
      "description":[],
      "price":[],
      "category":[],
      "keywords":[]
    });
  }
  ngDoCheck(): void {
   
    
  }

  ngOnInit(): void {
    //check if the user is merchant or not
    var str=<any>localStorage.getItem("user");
    var user=<any>JSON.parse(str);
    console.log("the user object is:")
    console.log(user)
    if(user==null)
    {
      this.router.navigate(['404']);
      
      return;
    }else{
      if(user.role!='merchant')
      {
        // alert("You are not merchant");
        this.router.navigate(['404']);
      }
      // else{
        // alert("You are allowed... because, you are merchant")
      // }
    }



    this.ps.fnFindProductsByUser(user).subscribe((data)=>{
      this.products=data;
    });
  }

fnAdd()
{
 var prd=this.productForm.value;
 var str=<any>localStorage.getItem("user"); 
 var user=JSON.parse(str);
  prd.user=user;
  console.log("we are sending product info as:")
  console.log(prd)
  this.ps.fnAddProduct(prd).subscribe((data)=>{
    console.log("response whiel a dding is :")
    console.log(data)
  });
 

}


  
}
