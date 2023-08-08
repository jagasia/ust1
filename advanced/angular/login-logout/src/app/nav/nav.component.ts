import { Component, DoCheck, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit, OnChanges, DoCheck {
  status='login';
  constructor(private ls:LoginService) { }

  ngOnInit(): void {
  }

  
  ngOnChanges(changes: SimpleChanges):void
  {
          
  }

  ngDoCheck(): void {
    this.ls.fnPublish().subscribe((data)=>{
      // console.log("Nav got this:"+data);      
      this.status=<string>data;
    
    });
    
  }
}
