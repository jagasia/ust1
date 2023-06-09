import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:any;
  employeeForm:any;
  constructor(private es:EmployeeService, private fb:FormBuilder) { 
    this.employeeForm=this.fb.group({
      id:[],
      firstName:[],
      lastName:[],
      department:[]
    });
  }

  ngOnInit(): void {
    console.log("Started");
    this.es.retrieveAllEmployees().subscribe((response)=>{
      this.employees=response;
      console.log(this.employees);
    });
}

  fnAdd()
  {
    console.log(this.employeeForm.value);
    this.es.addEmployee(this.employeeForm.value).subscribe((data)=>{
      console.log(data);
    });
  }

  fnUpdate()
  {
    console.log(this.employeeForm.value);
    this.es.updateEmployee(this.employeeForm.value).subscribe((data)=>{
      console.log(data);
    });
  }

  fnDelete()
  {
    console.log(this.employeeForm.controls.id.value);
    this.es.deleteEmployee(this.employeeForm.controls.id.value).subscribe((data)=>{
      console.log(data);
    })
  }

}
