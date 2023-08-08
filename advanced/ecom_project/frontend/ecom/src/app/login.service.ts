import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  URL='http://localhost:8081/user'
  constructor(private http:HttpClient) { }

  fnValidateLogin(ar:any)
  {
    return this.http.post(this.URL+"/validate",ar);
  }
}
