import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { MenubarModule } from 'primeng/menubar';


@Component({
  selector: 'app-adminheader',
  standalone: true,
  imports: [MenubarModule],
  templateUrl: './adminheader.component.html',
  styleUrl: './adminheader.component.scss'
})
export class AdminheaderComponent implements OnInit {
  items: MenuItem[] | undefined;
  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-home',
        routerLink: '/adminhomepage',
      },
      {
        label: 'User Management',
        icon: 'pi pi-fw pi-server',
        routerLink: '/adminlistuser',
      },
      {
        label: 'Vendor Management',
        icon: 'pi pi-fw pi-server',
        routerLink: '/adminlistvendor',
      },
      {
        label: 'List Transaction',
        icon: 'pi pi-fw pi-book',
        routerLink: '/adminlisttransaction',
      },
      {
        label: 'Admin Profile',
        icon: 'pi pi-fw pi-user',
        routerLink: '/adminprofile',
      },
      {
        label: 'Logout',
        icon: 'pi pi-fw pi-sign-out',
        routerLink: '/',
      },
      
    ];
  }
}


