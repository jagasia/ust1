import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OtpServiceService {
  URL="http://localhost:5000/"
  constructor(private http:HttpClient) { }

  generateOtp():Observable<any>
  {
    return this.http.get(this.URL);
  }

  fnPublish()
  {
    
    // return rnd;
    const myObservable=new Observable(observer=>{
      setTimeout(()=>{
        var rnd=Math.random()*100;
        observer.next(rnd);
      },100);
    });
    return myObservable;
  }

  fnPromise()
  {
    const promise=new Promise((approve,reject)=>{
      var rnd=Math.random()*100;
      approve(rnd);
    });
    return promise;
  }

}
