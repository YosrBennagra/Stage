import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Recharge } from '../models/Recharge.model';
@Injectable({
    providedIn: 'root'
  })


  export class RechargeService {
    readonly API_URL = "http://localhost:8080";
    readonly ENDPOINT_USER = "/getrecharges";
  
    constructor(private httpClient: HttpClient) { }
  
    getRecharges() {
      return this.httpClient.get<Recharge[]>(this.API_URL + this.ENDPOINT_USER);
    }
  
  }