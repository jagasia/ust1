import { Component, SimpleChanges } from '@angular/core';
// import { LoginService } from '../login.service';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent {
  status='login';
  // constructor(private ls:LoginService) { }
  constructor(){}

  ngOnInit(): void {
  }

  
  ngOnChanges(changes: SimpleChanges):void
  {
          
  }

}
