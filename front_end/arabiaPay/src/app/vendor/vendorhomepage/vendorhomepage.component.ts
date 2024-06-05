import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VendorheaderComponent } from '../vendorheader/vendorheader.component';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';


@Component({
  selector: 'app-vendorhomepage',
  standalone: true,
  imports: [CommonModule, VendorheaderComponent, FooterpageComponent],
  templateUrl: './vendorhomepage.component.html',
  styleUrl: './vendorhomepage.component.scss'
})
export class VendorhomepageComponent {

}
