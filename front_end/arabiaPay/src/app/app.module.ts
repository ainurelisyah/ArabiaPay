import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { routes } from './app.routes';
import { HomepageComponent } from './home/homepage/homepage.component';
import { CheckboxModule } from 'primeng/checkbox';
import { PasswordModule } from "primeng/password";
import { HttpClientModule } from '@angular/common/http';
import { UserhomepageComponent } from './user/userhomepage/userhomepage.component';
import { AdminhomepageComponent } from './admin/adminhomepage/adminhomepage.component';



@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    UserhomepageComponent,
    AdminhomepageComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    FormsModule,
    ReactiveFormsModule ,
    HttpClientModule,
    RouterModule.forRoot(routes),
    CheckboxModule,
    PasswordModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
