import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CheckboxModule } from 'primeng/checkbox';
import { InputTextModule } from 'primeng/inputtext';
import { ButtonModule } from 'primeng/button';
import { PasswordModule } from "primeng/password";
import { HeaderpageComponent } from '../headerpage/headerpage.component';
import { FooterpageComponent } from '../footerpage/footerpage.component';
import { Router } from '@angular/router';
import { RippleModule } from 'primeng/ripple';
import { PrimeNGConfig } from 'primeng/api';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UserService } from '../../services/user.service';;
import { ClientService } from '../../services/client.service';;
import { VendorService } from '../../services/vendor.service';


@Component({
  selector: 'app-signuppage',
  standalone: true,
  imports: [
    CommonModule, 
    CheckboxModule, 
    PasswordModule, 
    InputTextModule, 
    ButtonModule, 
    HeaderpageComponent, 
    FooterpageComponent, 
    RippleModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [UserService, ClientService, VendorService],
  templateUrl: './signuppage.component.html',
  styleUrl: './signuppage.component.scss'
})
export class SignuppageComponent implements OnInit {
  
  signupUserForm!: FormGroup;

  constructor (
    private primengConfig: PrimeNGConfig, 
    private router: Router, 
    private userService: UserService,
    private clientService: ClientService,
    private vendorService: VendorService,
    private formBuilder: FormBuilder
    ) {}

  ngOnInit() {
    this.primengConfig.ripple = true;
    this.signupUserForm = this.formBuilder.group({
      username: [null, [Validators.required]],
      password: [null, [Validators.required]],
      email: [null, [Validators.required]],
      phone_no: [null, [Validators.required]],
      user_id: [null, [Validators.required]],
    });
  }
  onSubmit() { 
    
    const username = this.signupUserForm.value.username;
    const password = this.signupUserForm.value.password;
    const ewallet_id = this.signupUserForm.value.ewallet_id;
    const loginData = {"username": username, "password": password };
    console.log(ewallet_id);

    //add to user table
    this.userService.addUser(this.signupUserForm.value).subscribe((res) => {

      if (res!=null) {
        const user_id = res.user_id;
        console.log(res);
        const clientData = {"user_id": user_id, "ewallet_id": ewallet_id }
        const vendorData = {"user_id": user_id, "username" : username }

        //add to client table
        this.clientService.addClient(clientData).subscribe((res2) => {
          
          if(res2 != null) {
            alert("Welcome to Arabia Pay!");
            console.log(res2);

            

            //login
            this.userService.loginByUsernameAndPassword(loginData).subscribe((res) => {

              if (res != null) {
                const user_id = res.user_id;
                this.router.navigate(['', {user_id}]);
              }
            })
          }
        })
        //add to vendor table
        this.vendorService.addVendor(vendorData).subscribe((res3) =>  {

          if(res3 != null) {
            alert("Welcome to Arabia Pay!");
            console.log(res3);
          }
        })
      }
    })
  } 
  
    navigateToUserhomepage() {
    this.router.navigate(['/userhomepage']);
  }
    goToLoginpage() {
    this.router.navigate(['/']);
  }

}
