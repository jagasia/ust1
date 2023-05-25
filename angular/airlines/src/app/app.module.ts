import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AirlineComponent } from './airline/airline.component';
import { FormsModule } from '@angular/forms';
import {  ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AjayComponent } from './ajay/ajay.component';
import { LengthPipe } from './length.pipe';
import { BluePipe } from './blue.pipe';

@NgModule({
  declarations: [
    AppComponent,
    AirlineComponent,
    AjayComponent,
    LengthPipe,
    BluePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
