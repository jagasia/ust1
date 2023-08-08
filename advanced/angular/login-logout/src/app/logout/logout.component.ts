import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private ls:LoginService, private router:Router) { }

  ngOnInit(): void {
    localStorage.removeItem("username");
    // this.ls.fnPublish();
    this.ls.fnUpdateStatus();
  }

}
