import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerProductComponent } from './customer-product/customer-product.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { MerchantComponent } from './merchant/merchant.component';
import { NotAllowedComponent } from './not-allowed/not-allowed.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [
  {path:'jag',component:LoginComponent,
  children:[
    {path:'',
  component:LoginComponent,
outlet:'jag'}
  ]
},
  {path:"login",component:LoginComponent},
  {path:"product",component:ProductComponent},
  {path:"merchant",component:MerchantComponent},
  {path:"logout",component:LogoutComponent},
  {path:"cproduct",component:CustomerProductComponent},
  {path:"404",component:NotAllowedComponent},
  {path:'**',component:NotAllowedComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
