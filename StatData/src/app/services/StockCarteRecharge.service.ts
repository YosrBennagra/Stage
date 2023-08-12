import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StockCarteRecharge } from '../models/Stock_carte_recharge.model';
@Injectable({
    providedIn: 'root'
  })


  export class StockCarteRechargeService {
    readonly API_URL = "http://localhost:8080";
    readonly ENDPOINT_USER = "/get_stock_carte_recharge";
  
    constructor(private httpClient: HttpClient) { }
  
    getStockCarteRecharges() {
      return this.httpClient.get<StockCarteRecharge[]>(this.API_URL + this.ENDPOINT_USER);
    }
  
  }