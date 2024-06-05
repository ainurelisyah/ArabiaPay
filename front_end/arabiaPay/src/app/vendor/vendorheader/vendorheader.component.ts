import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { MenubarModule } from 'primeng/menubar';


@Component({
  selector: 'app-vendorheader',
  standalone: true,
  imports: [MenubarModule],
  templateUrl: './vendorheader.component.html',
  styleUrl: './vendorheader.component.scss'
})
export class VendorheaderComponent implements OnInit {
  items: MenuItem[] | undefined;
  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-home',
        routerLink: '/vendorhomepage',
      },
      {
        label: 'Product Management',
        icon: 'pi pi-fw pi-shopping-bag',
        routerLink: '/vendorproduct',
      },
      {
        label: 'List Transactions',
        icon: 'pi pi-fw pi-book',
        routerLink: '/vendorlisttransaction',
      },
      {
        label: 'Vendor Profile',
        icon: 'pi pi-fw pi-user',
        routerLink: '/vendorprofile',
      },
      {
        label: 'Logout',
        icon: 'pi pi-fw pi-sign-out',
        routerLink: '/',
      },
      
    ];
  }
}

