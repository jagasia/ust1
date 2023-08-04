import { Component, OnInit } from '@angular/core';
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
  

  constructor(private ls:LoginService) { }

  ngOnInit(): void {
  }

  fnLogin()
  {
    console.log("Comparing "+this.username+" with "+this.password);
    if(this.username==this.password)
    {
      //login successful
      localStorage.setItem("username",this.username);
      
      this.message="Login successful";
      // this.ls.fnPublish();
    }else{
      //login failure
      this.message="Login Failed";
    }

  }

}
