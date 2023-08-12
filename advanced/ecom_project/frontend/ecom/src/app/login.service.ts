import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

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

  fnPublish()
  {
    const myObservable=new Observable((observer)=>{
      setTimeout(() => {
        var status="login";
        var user=localStorage.getItem("user");
        if(user!=null)
        {
          status="logout";
        }
        observer.next(status);
      }, 1000);
    });
    return myObservable;
  }
}
