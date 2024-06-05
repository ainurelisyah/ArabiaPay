import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HistoryService {

  serverHost = "http://localhost:8080";

  constructor(private http : HttpClient) { }

  getHistory(){
    return this.http.get(this.serverHost + "/transaction");
  }
}
