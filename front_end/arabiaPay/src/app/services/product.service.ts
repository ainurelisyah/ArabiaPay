import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  serverHost = "http://localhost:8080";

  constructor(private http : HttpClient) { }

  getProducts(){
    return this.http.get(this.serverHost + "/product");
  }
}