import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { MerchantComponent } from './merchant/merchant.component';
import { NotAllowedComponent } from './not-allowed/not-allowed.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"product",component:ProductComponent},
  {path:"merchant",component:MerchantComponent},
  {path:"logout",component:LogoutComponent},
  {path:"404",component:NotAllowedComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
