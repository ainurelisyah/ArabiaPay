import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserService } from '../../services/user.service';
import { HttpClientModule } from '@angular/common/http';
import { UserheaderComponent } from '../userheader/userheader.component';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';
import { MenuItem } from 'primeng/api';


@Component({
  selector: 'app-userprofile',
  standalone: true,
  imports: [CommonModule, FooterpageComponent, HttpClientModule, UserheaderComponent],
  providers: [UserService],
  templateUrl: './userprofile.component.html',
  styleUrl: './userprofile.component.scss'
})
export class UserprofileComponent implements OnInit{
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