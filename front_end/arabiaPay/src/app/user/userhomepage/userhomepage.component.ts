import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserheaderComponent } from '../userheader/userheader.component';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';

@Component({
  selector: 'app-userhomepage',
  standalone: true,
  imports: [CommonModule, UserheaderComponent, FooterpageComponent],
  templateUrl: './userhomepage.component.html',
  styleUrl: './userhomepage.component.scss'
})
export class UserhomepageComponent {

}
