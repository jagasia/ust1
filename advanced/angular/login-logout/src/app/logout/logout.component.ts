import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private ls:LoginService) { }

  ngOnInit(): void {
    localStorage.removeItem("username");
    // this.ls.fnPublish();
    this.ls.fnUpdateStatus();
  }

}
