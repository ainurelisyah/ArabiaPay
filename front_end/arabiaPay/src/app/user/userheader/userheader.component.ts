import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { MenubarModule } from 'primeng/menubar';

@Component({
  selector: 'app-userheader',
  standalone: true,
  imports: [MenubarModule],
  templateUrl: './userheader.component.html',
  styleUrl: './userheader.component.scss'
})
export class UserheaderComponent implements OnInit {
  items: MenuItem[] | undefined;

  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-home',
        routerLink: '/userhomepage',
      },
      {
        label: 'Expense Tracker',
        icon: 'pi pi-fw pi-chart-line',
        routerLink: '/userexpensetracker',
      },
      {
        label: 'Transfer to User',
        icon: 'pi pi-fw pi-money-bill',
        routerLink: '/usertransactionpage',
      },
      {
        label: 'Transaction History',
        icon: 'pi pi-fw pi-history',
        routerLink: '/usertransactionhistory',
      },
      {
        label: 'User Profile',
        icon: 'pi pi-fw pi-user',
        routerLink: '/userprofile',
      },
      {
        label: 'Logout',
        icon: 'pi pi-fw pi-sign-out',
        routerLink: '/',
      },
      
    ];
  }
}

