import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserheaderComponent } from '../userheader/userheader.component';
import { FloatLabelModule } from 'primeng/floatlabel';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';
import { InputTextModule } from 'primeng/inputtext';
import { ButtonModule } from 'primeng/button';
import { Router } from '@angular/router';
import { RippleModule } from 'primeng/ripple';
import { PrimeNGConfig } from 'primeng/api';


@Component({
  selector: 'app-usertransactionpage',
  standalone: true,
  imports: [CommonModule, UserheaderComponent, FloatLabelModule, FooterpageComponent, InputTextModule, ButtonModule, RippleModule],
  
  templateUrl: './usertransactionpage.component.html',
  styleUrl: './usertransactionpage.component.scss'
})


export class UsertransactionpageComponent {
  constructor (private primengConfig: PrimeNGConfig, private router: Router) {}

  ngOnInit() {
    this.primengConfig.ripple = true;
  }
  navigateToUserinvoice() {
    this.router.navigate(['/userinvoice']);
  }
  
}
