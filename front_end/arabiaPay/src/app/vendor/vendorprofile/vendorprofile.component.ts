import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VendorheaderComponent } from '../vendorheader/vendorheader.component';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';

@Component({
  selector: 'app-vendorprofile',
  standalone: true,
  imports: [CommonModule, VendorheaderComponent, FooterpageComponent],
  templateUrl: './vendorprofile.component.html',
  styleUrl: './vendorprofile.component.scss'
})
export class VendorprofileComponent {

}
