import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  fnUpdateStatus()
  {
    this.fnPublish();
  }


  fnPublish()
  {
    
    const myObservable=new Observable(observer=>{
      setTimeout(()=>{
        var status='login';
        var username=localStorage.getItem("username");
        if(username!=null)
        {
          status="logout";
        }
        
        observer.next(status);
      },1000);
      
      
    });
    return myObservable;
  }
}
