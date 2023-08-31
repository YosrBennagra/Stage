import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Import corrected
import { User } from '../models/user.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  readonly ENDPOINT_USERADD = "/adduser";
  private apiUrl = "http://localhost:8081";

  constructor(private http: HttpClient) { }

  login(credentials: { login: string, password: string }): Observable<User> {
    return this.http.post<User>(`${this.apiUrl}/auth/login`, credentials);
  }

  addUser(user: User) {
    return this.http.post(this.apiUrl + this.ENDPOINT_USERADD, user);
  }
}
