import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderpageComponent } from '../headerpage/headerpage.component';
import { FooterpageComponent } from '../footerpage/footerpage.component';
import { CheckboxModule } from 'primeng/checkbox';
import { InputTextModule } from 'primeng/inputtext';
import { ButtonModule } from 'primeng/button';
import { Router } from '@angular/router';
import { RippleModule } from 'primeng/ripple';
import { PrimeNGConfig } from 'primeng/api';
import { InputGroupModule } from 'primeng/inputgroup';
import { InputGroupAddonModule } from 'primeng/inputgroupaddon';
import { UserService } from '../../services/user.service';
import { HttpClientModule } from '@angular/common/http';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';



@Component({
  selector: 'app-homepage',
  standalone: true,
  imports: [
    CommonModule, 
    HeaderpageComponent, 
    FooterpageComponent, 
    CheckboxModule, 
    InputTextModule, 
    ButtonModule, 
    RippleModule,
    InputGroupModule,
    InputGroupAddonModule,
    HttpClientModule,
    ReactiveFormsModule
    ],
  providers: [UserService],
  templateUrl: './homepage.component.html', 
  styleUrl: './homepage.component.scss'
})
export class HomepageComponent implements OnInit {

  loginUserForm!: FormGroup;

  constructor (private primengConfig: PrimeNGConfig, private router: Router, private formBuilder: FormBuilder, private userService: UserService) {}

  ngOnInit() : void {
    this.primengConfig.ripple = true;
    this.loginUserForm = this.formBuilder.group({
      username: [null, [Validators.required]],
      password: [null, [Validators.required]],
    });
  }

  onSubmit() {
    console.log(this.loginUserForm.value);
    this.userService.loginByUsernameAndPassword(this.loginUserForm.value).subscribe((res) => {

      if (res != null) {
        const user_id = res.user_id;
        if (res.level == "client") {
          alert("Login successfully!");
          this.router.navigate(['/userhomepage',{user_id}]);
        } else if (res.level == "vendor") {
          alert("Login successfully!");
          this.router.navigate(['/vendorhomepage',{user_id}]);
        } else {
          alert("Login successfully!");
          this.router.navigate(['/adminhomepage',{user_id}]);
        }
      } else {
        alert("User not found, Please enter correct email and password!");
      }
      console.log(res);
    })
  }

  navigateToUserhomepage() {
    this.router.navigate(['/userhomepage']);
  }
  goToSignUpPage(){
    this.router.navigate(['/signup']);
  }
  goToForgotPage(){
    this.router.navigate(['/forgot']);
  }
  
}