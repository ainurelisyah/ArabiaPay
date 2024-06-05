import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { AdminheaderComponent } from '../adminheader/adminheader.component';
import { MenuItem } from 'primeng/api';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';

@Component({
  selector: 'app-adminlistuser',
  standalone: true,
  imports: [TableModule, HttpClientModule, AdminheaderComponent, FooterpageComponent],
  providers : [UserService],
  templateUrl: './adminlistuser.component.html',
  styleUrl: './adminlistuser.component.scss'
})
export class AdminlistuserComponent {
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
