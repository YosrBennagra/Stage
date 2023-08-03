import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Import corrected
import { User } from './Model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UService {
  readonly API_URL = "http://localhost:8090";
  readonly ENDPOINT_USER = "/getusers";
  readonly ENDPOINT_USERADD = "/adduser";

  constructor(private httpClient: HttpClient) { }

  getUsers() {
    return this.httpClient.get<User[]>(this.API_URL + this.ENDPOINT_USER);
  }

  addUser(user: User) {
    return this.httpClient.post(this.API_URL + this.ENDPOINT_USERADD, user);
  }
}
