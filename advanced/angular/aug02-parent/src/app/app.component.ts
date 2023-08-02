import { Component } from '@angular/core';
import { AuthRequest } from './auth-request';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'aug02-parent';
  x="India"


  fnLogin(arg:AuthRequest)
  {
    // alert(JSON.stringify(arg))
    alert(arg.username);
  }

}
