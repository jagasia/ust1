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
  user:any;
  photoFile:any;
  constructor(private fb:FormBuilder, private ps:ProductService, private router:Router) { 
    this.productForm=this.fb.group({
      "id":[],
      "name":[],
      "description":[],
      "price":[],
      "category":[],
      "keywords":[],
      "photo":[]
    });
  }
  ngDoCheck(): void {
    
  }

  onFileChanged(event:any)
  {
    this.photoFile=event.target.files[0];
    console.log(this.photoFile);
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
      this.user=user;
      if(user.role=='merchant')
      {
        this.ps.fnFindProductsByUser(user).subscribe((data)=>{
          this.products=data;
        });
      }else
      {
        //customer
        this.ps.fnGetAllProducts().subscribe((data)=>{
          this.products=data;
        });
      }
      // if(user.role!='merchant')
      // {
      //   // alert("You are not merchant");
      //   this.router.navigate(['404']);
      // }
      // else{
        // alert("You are allowed... because, you are merchant")
      // }
    }



   
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


fnAdd1()
{
  // @RequestParam("category") String category,
  // @RequestParam("description") String description,
  //@RequestParam("keywords") String keywords,
  //@RequestParam("name") String name,
  //@RequestParam("price") Double price,
  //@RequestParam("user") User user,
  //@RequestParam("photo") MultipartFile file 
  
  var formData:FormData=new FormData();
  
  formData.append('category',this.productForm.controls.category.value);
  formData.append('description',this.productForm.controls.description.value);
  formData.append("keywords",this.productForm.controls.keywords.value);
  formData.append("name",this.productForm.controls.name.value);
  formData.append("price",this.productForm.controls.price.value);
  var str=<any>localStorage.getItem("user"); 
  var user=JSON.parse(str); 
  formData.append("userId",user.id);
  formData.append("photo",this.photoFile);
  // alert(JSON.stringify(formData))
  formData.forEach((value,key) => {
    console.log(key+" "+value)
  });
  this.ps.fnAddProductNew(formData).subscribe((data)=>{
    console.log("resonse from server after adding:")
    console.log(data);
  });
}
  
}
