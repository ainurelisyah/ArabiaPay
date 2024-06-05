import { Component } from '@angular/core';
import { HeaderpageComponent } from '../headerpage/headerpage.component';
import { FooterpageComponent } from '../footerpage/footerpage.component';




@Component({
  selector: 'app-contactpage',
  standalone: true,
  imports: [HeaderpageComponent, FooterpageComponent],
  templateUrl: './contactpage.component.html',
  styleUrl: './contactpage.component.scss'
})
export class ContactpageComponent {

}
