import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;
  user:any;
  constructor(private fb:FormBuilder, private ls:LoginService, private router:Router) { 
    this.loginForm=this.fb.group({
      "id":[],
      "password":[]
    });
  }

  ngOnInit(): void {
  }

  fnLogin()
  {
    var ar=this.loginForm.value;
    console.log("We are sending:")
    console.log(ar);
    this.ls.fnValidateLogin(ar).subscribe((data)=>{
      console.log("we received:")
      console.log(data);
      if(data!=null)
      {
        //login is successful
        var response={"jwt":'',"user":null};
        response=<any>data;
        var obj=JSON.stringify(response.user);
        console.log("writing json to local storage as:")
        console.log(obj);
        localStorage.setItem("user",obj);
        localStorage.setItem("jwt",response.jwt);
        this.user=response.user;
        if(this.user.role=='merchant')
          this.router.navigate(["product"]);
        else{
          //to customer
          this.router.navigate(['/','cproduct']);
        }
      }
    });
  }
}
