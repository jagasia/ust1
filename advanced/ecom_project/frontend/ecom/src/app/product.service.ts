import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
   URL='http://localhost:8081/product';

  constructor(private http:HttpClient) { }


  fnFindProductsByUser(user:any)
  {
    return this.http.post(this.URL+"/user",user);
  }

  fnGetAllProducts()
  {
    return this.http.get(this.URL);
  }

  findProductById(id:number)
  {
    return this.http.get(this.URL+"/"+id);
  }

  fnAddProduct(product:any)
  {
    return this.http.post(this.URL,product);
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
