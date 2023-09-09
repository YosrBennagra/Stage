import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StockCarteRecharge, StockCarteRechargePage } from '../models/Stock_carte_recharge.model';
@Injectable({
    providedIn: 'root'
  })


  export class StockCarteRechargeService {
    readonly API_URL = "http://localhost:8081";
    readonly ENDPOINT_FIND = "/getStockCarteRechargeBy";
  
    constructor(private httpClient: HttpClient) { }

    getFilteredStockCarteRecharges(
      mois: string | null,
      cdDist: string | null,
      mntRing: number | null,
      nombre: number | null,
      page: number,
      size: number
    ) {
      const filterData = {
        mois,
        cdDist,
        mntRing,
        nombre
      };
  
      const params = {
        page: page.toString(),
        size: size.toString()
      };
  
      return this.httpClient.post<StockCarteRechargePage>(
        this.API_URL + this.ENDPOINT_FIND,
        filterData,
        { params }
      );
    }
  
  }