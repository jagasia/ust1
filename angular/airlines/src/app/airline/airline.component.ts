import { Component, OnInit } from '@angular/core';
import { AirlineService } from '../airline.service';
import {FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-airline',
  templateUrl: './airline.component.html',
  styleUrls: ['./airline.component.css']
})
export class AirlineComponent implements OnInit {
  airlines:any;
  airlineForm:any;

  constructor(private as:AirlineService, private fb:FormBuilder) { 
    this.airlineForm=this.fb.group({
      id:[],
      name:[],
      country:[],
      logo:[],
      slogan:[],
      head_quaters:[],
      website:[],
      established:[],
    });
  }

  ngOnInit(): void {
    //call the service method
    this.as.retrieveAllAirlines().subscribe((result)=>{
      this.airlines=result;
    });
  }


  fnAdd()
  {
    this.as.addAirline(this.airlineForm.value).subscribe((response)=>{
      console.log(response);
    });
  }
}
