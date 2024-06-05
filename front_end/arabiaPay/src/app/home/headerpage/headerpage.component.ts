import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { MenubarModule } from 'primeng/menubar';

@Component({
  selector: 'app-headerpage',
  standalone: true,
  imports: [MenubarModule],
  templateUrl: './headerpage.component.html',
  styleUrl: './headerpage.component.scss'
})
export class HeaderpageComponent implements OnInit {
  items: MenuItem[] | undefined;

  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-home',
        routerLink: '/',
      },
      {
        label: 'Contact Us',
        icon: 'pi pi-fw pi-phone',
        routerLink: '/contact',
      },
      
    ];
  }
}

