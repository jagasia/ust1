import { Component, OnInit } from '@angular/core';
import { OtpServiceService } from '../otp-service.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  enteredOtp:string='';
  
  constructor(private otp:OtpServiceService) { }

  ngOnInit(): void {
  }

  fnGenerateOtp()
  {
    this.otp.generateOtp().subscribe((data)=>{
      console.log(data);
      localStorage.setItem("otp",data.toString());
    });
    alert("hello world")
  }

  fnValidateOtp()
  {
    if(this.enteredOtp=='')
    {  
      alert("Kindly enter the otp and click validate button");
      return;
    }

    var temp=localStorage.getItem("otp");
    if(temp=='')
    {
      alert("kindly generate the otp first");
      return;
    }

    if(this.enteredOtp==temp)
    {
      alert("OTP is correct");
    }else
    {
      alert("Invalid OTP");
    }
  }

}
