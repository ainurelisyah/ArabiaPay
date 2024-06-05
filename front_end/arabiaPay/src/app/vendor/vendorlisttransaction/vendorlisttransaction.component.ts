import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VendorheaderComponent } from '../vendorheader/vendorheader.component';
import { UserService } from '../../services/user.service';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { MenuItem } from 'primeng/api';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';


@Component({
  selector: 'app-vendorlisttransaction',
  standalone: true,
  imports: [CommonModule, VendorheaderComponent, TableModule, HttpClientModule, FooterpageComponent],
  providers : [ UserService],
  templateUrl: './vendorlisttransaction.component.html',
  styleUrl: './vendorlisttransaction.component.scss'
})
export class VendorlisttransactionComponent {
  users: any;
  constructor(private userService: UserService){}

  ngOnInit(): void {
    this.getUsers();
  }

  getUsers(){
    this.userService.getUsers().subscribe((users) => {
      console.log(users);
      this.users = users;
    });
  }


}