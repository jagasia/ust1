import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  URL='http://localhost:8081/cart';
  constructor(private http:HttpClient) { }

  fnFindCartsByUser(user:any)
  {
    return this.http.post(this.URL+"/user",user);
  }

  fnAddToCart(cart:any)
  {
    return this.http.post(this.URL,cart);
  }
}
