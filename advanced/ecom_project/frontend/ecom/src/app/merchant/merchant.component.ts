import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-merchant',
  templateUrl: './merchant.component.html',
  styleUrls: ['./merchant.component.css']
})
export class MerchantComponent implements OnInit {
  user:any;
  constructor() { }

  ngOnInit(): void {
    var str:string=<string>localStorage.getItem("user");
    var user=JSON.parse(str);
    this.user=user;
  }

}
