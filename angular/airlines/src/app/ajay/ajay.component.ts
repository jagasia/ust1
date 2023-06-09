import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ajay',
  templateUrl: './ajay.component.html',
  styleUrls: ['./ajay.component.css']
})
export class AjayComponent implements OnInit {
  num:number=10;
  today:Date=new Date();
  name:string="ajay";
  x:number=1;

  constructor() { }

  ngOnInit(): void {
  }

}
