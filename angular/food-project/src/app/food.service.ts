import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  URL="http://localhost:8080/food";
  constructor(private http:HttpClient) { }

  addFood(food:any){
    return this.http.post(this.URL+"/photo",food);
  }

  retrieveAllFoods(){
    return this.http.get(this.URL);
  }

  findFoodById(id:number){
    return this.http.get(this.URL+"/"+id);
  }

  updateFood(food:any){
    return this.http.put(this.URL,food);
  }

  deleteFood(id:number){
    return this.http.delete(this.URL+"/"+id);
  }
}
