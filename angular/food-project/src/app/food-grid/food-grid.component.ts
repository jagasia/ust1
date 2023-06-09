import { Component, OnInit } from '@angular/core';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-food-grid',
  templateUrl: './food-grid.component.html',
  styleUrls: ['./food-grid.component.css']
})
export class FoodGridComponent implements OnInit {
  foods:any;
  constructor(private fs:FoodService) { }

  ngOnInit(): void {
    this.fs.retrieveAllFoods().subscribe((data)=>{
      this.foods=data;
      console.log(data);
    })
  }

}
