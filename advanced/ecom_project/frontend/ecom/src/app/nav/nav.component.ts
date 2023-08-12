import { Component, DoCheck, SimpleChanges } from '@angular/core';
import { LoginService } from '../login.service';
// import { LoginService } from '../login.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements DoCheck {
  status='login';
  // constructor(private ls:LoginService) { }
  constructor(private ls:LoginService){}
  ngDoCheck(): void {
    this.ls.fnPublish().subscribe((data)=>{
      this.status=<string>data;
    });
  }

  ngOnInit(): void {
  }

  
  ngOnChanges(changes: SimpleChanges):void
  {
    
  }

}
