import { Component, OnInit } from '@angular/core';
import { OtpServiceService } from '../otp-service.service';

@Component({
  selector: 'app-dummy',
  templateUrl: './dummy.component.html',
  styleUrls: ['./dummy.component.css']
})
export class DummyComponent implements OnInit {
  num:number=0;
  constructor(private otp:OtpServiceService) { }

  ngOnInit(): void {
    
  }

  fn1()
  {
    this.otp.fnPublish().subscribe((response)=>
      {
        this.num=<number>response;
      }
    );
    console.log("Hello world")
  }

}
