import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  serverHost = "http://localhost:8080";

  constructor(private http : HttpClient) { }

  addClient(client:any): Observable<any>{
    return this.http.post(this.serverHost + "/register", client);
  }
}