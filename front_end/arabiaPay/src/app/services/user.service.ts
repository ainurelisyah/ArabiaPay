import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  serverHost = "http://localhost:8080";

  constructor(private http : HttpClient) { }

  getUsers(){
    return this.http.get(this.serverHost + "/userlist");
  }

  loginByUsernameAndPassword(input:any): Observable<any>{
    return this.http.post(this.serverHost + "/login", input);
  }

  addUser(user: any): Observable<any>{
    return this.http.post(this.serverHost + "/", user);
  }
}