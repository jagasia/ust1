import { Component } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  countries:string[]=["India","China","Japan","Pakistan","Bangladesh","Sri lanka","South Korea"];
  title = 'Addition';
  no1:string="20";
  no2:string="30";
  sum:number=0;
  type:string="number";
  color:string="red";
  visible:boolean=false;
  x : number=0;

  fn1()
  {
    // alert('hello world');
    // alert(this.no1+this.no2);
    var x=parseInt(this.no1);
    var y=parseInt(this.no2);
    this.sum=x+y;
  }
  fnLogin(arg:User)
  {
    alert("App component received: "+arg.username+" and "+arg.password)
  }
}
