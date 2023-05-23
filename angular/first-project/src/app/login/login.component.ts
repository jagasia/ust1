import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { User } from '../user';

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
  @Input() backgroundColor:string="yellow";
  @Output() loginEvent:EventEmitter<User>=new EventEmitter<User>();
  username:string="";
  password:string="";
  constructor() { }

  ngOnInit(): void {
  }

  fnLogin()
  {
    //raise an event
    let user:User=new User();
    user.username=this.username;
    user.password=this.password
    this.loginEvent.emit(user);
  }
}
