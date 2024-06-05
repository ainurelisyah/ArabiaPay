import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderpageComponent } from '../headerpage/headerpage.component';
import { FooterpageComponent } from '../footerpage/footerpage.component';
import { InputTextModule } from 'primeng/inputtext';
import { ButtonModule } from 'primeng/button';
import { Router } from '@angular/router';
import { RippleModule } from 'primeng/ripple';
import { PrimeNGConfig } from 'primeng/api';

@Component({
  selector: 'app-forgotpage',
  standalone: true,
  imports: [CommonModule, HeaderpageComponent, FooterpageComponent,InputTextModule, ButtonModule, RippleModule],
  templateUrl: './forgotpage.component.html',
  styleUrl: './forgotpage.component.scss'
})
export class ForgotpageComponent {
  constructor (private primengConfig: PrimeNGConfig, private router: Router) {}

  ngOnInit() {
    this.primengConfig.ripple = true;
  }
  navigateToHomepage() {
    this.router.navigate(['/']);
  }
}
