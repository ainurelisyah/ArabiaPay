import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserService } from '../../services/user.service';
import { HttpClientModule } from '@angular/common/http';
import { AdminheaderComponent } from '../adminheader/adminheader.component';
import { MenuItem } from 'primeng/api';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';

@Component({
  selector: 'app-adminprofile',
  standalone: true,
  imports: [CommonModule, HttpClientModule, AdminheaderComponent, FooterpageComponent],
  templateUrl: './adminprofile.component.html',
  styleUrl: './adminprofile.component.scss'
})
export class AdminprofileComponent {
  items: MenuItem[] = [];

  cardMenu: MenuItem[] = [];

  ngOnInit() {
    this.items = [
        { label: 'Angular.io', icon: 'pi pi-external-link', url: 'http://angular.io' },
        { label: 'Theming', icon: 'pi pi-bookmark', routerLink: ['/theming'] }
    ];

    this.cardMenu = [
        {
            label: 'Save', icon: 'pi pi-fw pi-check'
        },
        {
            label: 'Update', icon: 'pi pi-fw pi-refresh'
        },
        {
            label: 'Delete', icon: 'pi pi-fw pi-trash'
        },
    ];
}

}
