import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserheaderComponent } from '../userheader/userheader.component';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';
import { ChartModule } from 'primeng/chart';

@Component({
  selector: 'app-userexpensetracker',
  standalone: true,
  imports: [CommonModule, UserheaderComponent, FooterpageComponent, ChartModule],
  templateUrl: './userexpensetracker.component.html',
  styleUrl: './userexpensetracker.component.scss'
})
export class UserexpensetrackerComponent {

  data: any;
  options: any;

  constructor() {
    this.data = {
      labels: ['Last Month', 'This Month', 'Next Month'],
      datasets: [
        {
          label : 'Expenses', 
          data: [300, 500, 0],
          backgroundColor: ['#D24545'],
        },
        {
          label: 'Budget',
          data: [100, 200, 300],
          backgroundColor: '#7FC7D9',
        },
        
      ],
    };

    this.options = {
      responsive: true,
      scales: {
        x: {
          stacked: true,
        },
        y: {
          stacked: true,
        },
      },
    };
  }
}
