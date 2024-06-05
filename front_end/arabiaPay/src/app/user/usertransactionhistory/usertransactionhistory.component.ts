import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserheaderComponent } from '../userheader/userheader.component';
import { HistoryService } from '../../services/history.service';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { MenuItem } from 'primeng/api';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';


@Component({
  selector: 'app-usertransactionhistory',
  standalone: true,
  imports: [CommonModule, UserheaderComponent, TableModule, HttpClientModule, FooterpageComponent],
  providers : [ HistoryService],
  templateUrl: './usertransactionhistory.component.html',
  styleUrl: './usertransactionhistory.component.scss'
})
export class UsertransactionhistoryComponent {

  transaction: any;
  constructor(private historyService: HistoryService){}

  ngOnInit(): void {
    this.getHistory();
  }

  getHistory(){
    this.historyService.getHistory().subscribe((transaction) => {
      console.log(transaction);
      this.transaction = transaction;
    });
  }


}
