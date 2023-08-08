import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  username:string='';
  constructor(private ar:ActivatedRoute) { }

  ngOnInit(): void {
    this.ar.params.subscribe((username)=>{
      this.username=username['username'];
    });
    
  }

}
