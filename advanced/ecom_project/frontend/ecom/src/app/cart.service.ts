import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  URL='http://localhost:8081/cart';
  constructor(private http:HttpClient) { }

  fnHeaders()
  {
    var jwt=localStorage.getItem("jwt");
    const httpOptions = {
      headers: new HttpHeaders({
          'Content-Type':  'application/json',
          Authorization: 'Bearer ' + jwt
      })
  };
  return httpOptions;
  }

  fnFindCartsByUser(user:any)
  {
    return this.http.post(this.URL+"/user",user,this.fnHeaders());
  }

  fnAddToCart(cart:any)
  {
    return this.http.post(this.URL,cart,this.fnHeaders());
  }

  fnUpdateCart(cart:any)
  {
    return this.http.put(this.URL+"/"+cart.id,cart,this.fnHeaders());
  }

  fnDeleteCart(id:number)
  {
    return this.http.delete(this.URL+"/"+id,this.fnHeaders());
  }

}
