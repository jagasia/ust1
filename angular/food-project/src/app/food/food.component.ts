import { Component, OnInit } from '@angular/core';
import {FormBuilder} from '@angular/forms';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-food',
  templateUrl: './food.component.html',
  styleUrls: ['./food.component.css']
})
export class FoodComponent implements OnInit {
  foodForm:any;
   selectedFile = new File(["foo"], "foo.txt", {
    type: "text/plain",
  });

  constructor(private fb:FormBuilder,private fs:FoodService) {
    this.foodForm=this.fb.group({
      id:[],
      name:[],
      price:[],
      photo:[]
    });
   }

  ngOnInit(): void {
  }

  onFileChanged(event:any)
  {
    // alert('hi')
    console.log(event.target.files[0]);
    this.selectedFile=event.target.files[0];
    console.log(this.selectedFile);

  }

  fnAddProduct()
  {
    var formData=new FormData();
    formData.append('name',this.foodForm.controls.name.value);
    formData.append('price',this.foodForm.controls.price.value);
    formData.append('photo',this.selectedFile);
    
    this.fs.addFood(formData).subscribe((data)=>{
      console.log(data);
    });
  }

}
