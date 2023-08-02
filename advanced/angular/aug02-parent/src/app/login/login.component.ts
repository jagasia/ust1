import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { AuthRequest } from '../auth-request';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username='';
  password=''; 
  @Output() loginEvent:EventEmitter<AuthRequest>=new EventEmitter<AuthRequest>();
  constructor() { }

  ngOnInit(): void {
  }

  fnClick()
  {
    // this.loginEvent.emit(this.username+":"+this.password);
    var ar:AuthRequest=new AuthRequest();
    ar.username=this.username;
    ar.password=this.password;
    this.loginEvent.emit(ar);
  }
}
