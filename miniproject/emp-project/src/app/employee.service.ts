import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  URL="http://localhost:3000/employees";
  constructor(private http:HttpClient) { }

  retrieveAllEmployees()
  {
    return this.http.get(this.URL);
  }

  findEmployeeById(id:number)
  {
    return this.http.get(this.URL+"/"+id);
  }

  addEmployee(employee:any)
  {
    return this.http.post(this.URL,employee);
  }

  updateEmployee(employee:any)
  {
    return this.http.put(this.URL+"/"+employee.id,employee);
  }

  deleteEmployee(id:number)
  {
    return this.http.delete(this.URL+"/"+id);
  }
}
