import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AirlineService {
  URL='https://api.instantwebtools.net/v1/airlines';

  constructor(private http:HttpClient) { }

  retrieveAllAirlines()
  {
    return this.http.get(this.URL);
  }

  addAirline(airline:any)
  {
    return this.http.post(this.URL,airline);
  }

  findAirlineById(id:number)
  {
    return this.http.get(this.URL+"/"+id);
  }


}
