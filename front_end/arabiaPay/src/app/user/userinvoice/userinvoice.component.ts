import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserheaderComponent } from '../userheader/userheader.component';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';

@Component({
  selector: 'app-userinvoice',
  standalone: true,
  imports: [CommonModule, UserheaderComponent, FooterpageComponent],
  templateUrl: './userinvoice.component.html',
  styleUrl: './userinvoice.component.scss'
})
export class UserinvoiceComponent {

}
