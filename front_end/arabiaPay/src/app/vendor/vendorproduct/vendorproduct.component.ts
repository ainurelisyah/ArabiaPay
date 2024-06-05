import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VendorheaderComponent } from '../vendorheader/vendorheader.component';
import { MenuItem } from 'primeng/api';
import { ProductService } from '../../services/product.service';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { FooterpageComponent } from '../../home/footerpage/footerpage.component';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-vendorproduct',
  standalone: true,

  imports: [CommonModule, VendorheaderComponent, TableModule, HttpClientModule, FooterpageComponent],
  providers: [ProductService],

  templateUrl: './vendorproduct.component.html',
  styleUrls: ['./vendorproduct.component.scss']
})
export class VendorproductComponent implements OnInit {

  products: any;

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.getProducts(); // Corrected method invocation
  }

  getProducts() {
    this.productService.getProducts().subscribe((products) => {
      console.log(products);
      this.products = products;
    });
  }
}
