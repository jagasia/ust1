import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
   URL='http://localhost:8081/product';

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

  fnFindProductsByUser(user:any)
  {
    return this.http.post(this.URL+"/user",user,this.fnHeaders());
  }

  fnGetAllProducts()
  {
    return this.http.get(this.URL, this.fnHeaders());
  }

  findProductById(id:number)
  {
    return this.http.get(this.URL+"/"+id, this.fnHeaders());
  }

  fnAddProduct(product:any)
  {
    return this.http.post(this.URL,product, this.fnHeaders());
  }

  fnUpdateProduct(product:any)
  {
    return this.http.put(this.URL+"/"+product.id,product);
  }

  fnDeleteProduct(id:number)
  {
    return this.http.delete(this.URL+"/"+id);
  }
}
