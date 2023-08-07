import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  signupForm:any;
  constructor(private fb:FormBuilder) {
    this.signupForm=this.fb.group({
      // "username":['',[Validators.minLength(3), Validators.maxLength(10)]],
      "username":'',
      "password":[],
      "cpassword":[''],
      "firstName":[],
      "lastName":[]
      }, { validators: this.cpvalidator });
    }

  ngOnInit(): void {
  }

  get f()
  {
    return this.signupForm.controls;
  }

  fnAdd()
  {
    // alert(JSON.stringify(this.signupForm.value))
    // alert(this.signupForm.controls.firstName.value)
    alert(this.signupForm.controls["lastName"].value);
    var obj=this.signupForm.value;
    alert(obj.firstName)
  }

  cpvalidator(form: FormGroup) {
    const password = this.signupForm.controls['password'].value;
    const confirmation = this.signupForm.controls['cpassword'].value;

    if (!password || !confirmation) { // if the password or confirmation has not been inserted ignore
      return null;
    }
    
    if (confirmation.length > 0 && confirmation !== password) {
      confirmation.setErrors({ notMatch: true }); // set the error in the confirmation input/control
    }

    return null; // always return null here since as you'd want the error displayed on the confirmation input
 }

}
