import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OrderService } from '../order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  orders:any;
  user:any;
  constructor(private os:OrderService, private router:Router) { }

  ngOnInit(): void {
    var str=<any>localStorage.getItem("user");
    this.user=JSON.parse(str);
    if(this.user==null)
    {
      this.router.navigate(['/','404']);
    }
    this.os.fnGetOrdersByUser(this.user).subscribe((data)=>{
      this.orders=data;
      console.log(data)
    });
  }


}
