import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminheaderComponent } from '../adminheader/adminheader.component';
import { UserService } from '../../services/user.service';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { MenuItem } from 'primeng/api';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';


@Component({
  selector: 'app-adminlisttransaction',
  standalone: true,
  imports: [CommonModule, AdminheaderComponent, TableModule, HttpClientModule, FooterpageComponent],
  providers : [ UserService],
  templateUrl: './adminlisttransaction.component.html',
  styleUrl: './adminlisttransaction.component.scss'
})
export class AdminlisttransactionComponent {
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