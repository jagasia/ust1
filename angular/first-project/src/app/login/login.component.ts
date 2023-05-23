import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
//   template:`<div>
// 	User Name: <input type="text" /><br/>
// 	Password: <input type="password" /><br/>
// 	<input type="button" value="Login" />
// </div>`,
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  @Input() title:string="";
  constructor() { }

  ngOnInit(): void {
  }

}
