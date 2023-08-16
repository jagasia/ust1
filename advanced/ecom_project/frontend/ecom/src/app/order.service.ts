import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  URL="http://localhost:8081/order"
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

  fnGenerateOrderid()
  {
    return this.http.get(this.URL+"/generate",this.fnHeaders());
  }

  fnAddOrder(order:any)
  {
    return this.http.post(this.URL,order,this.fnHeaders());
  }

  fnGetOrdersByUser(user:any)
  {
    return this.http.post(this.URL+"/user",user,this.fnHeaders());
  }
}
