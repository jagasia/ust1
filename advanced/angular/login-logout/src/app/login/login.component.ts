import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string='';
  password:string='';
  message:string='';
  

  constructor(private ls:LoginService, private router:Router) { }

  ngOnInit(): void {
  }

  fnLogin()
  {
    console.log("Comparing "+this.username+" with "+this.password);
    if(this.username==this.password)
    {
      //login successful
      localStorage.setItem("username",this.username);
      
      

      //redirect to home page
      setTimeout(()=>{
        for(var i=5;i>=0;i--)
        {
          
          setTimeout(()=>{
            this.message="Login successful... Redirecting to home page.... in "+i+" seconds";       
          },1000);
          
          
        }
      },1000);        //this.router.navigate(['home']);
      
      
      

      // this.ls.fnPublish();
    }else{
      //login failure
      this.message="Login Failed";
    }

  }


}
