import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // Import corrected

@Injectable({
  providedIn: 'root'
})
export class UService {
  readonly API_URL = "http://localhost:8080";
  readonly ENDPOINT_USER = "/users";

  constructor(private httpClient: HttpClient) { }

  getUsers() {
    return this.httpClient.get(this.API_URL + this.ENDPOINT_USER);
  }
}
