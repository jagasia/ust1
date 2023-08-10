import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { MerchantComponent } from './merchant/merchant.component';
import { NavComponent } from './nav/nav.component';
import { NotAllowedComponent } from './not-allowed/not-allowed.component';
import { ProductComponent } from './product/product.component';
import { LogoutComponent } from './logout/logout.component';
import { CustomerProductComponent } from './customer-product/customer-product.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    MerchantComponent,
    LoginComponent,
    NavComponent,
    NotAllowedComponent,
    LogoutComponent,
    CustomerProductComponent
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
