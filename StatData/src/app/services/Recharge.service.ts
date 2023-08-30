import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Recharge, RechargePage } from '../models/Recharge.model';
@Injectable({
    providedIn: 'root'
  })


  export class RechargeService {
    readonly API_URL = "http://localhost:8080";
    readonly ENDPOINT_USER = "/getrecharges";
    readonly ENDPOINT_FIND = "/geRechargeFiltredBy";
  
    constructor(private httpClient: HttpClient) { }
  
    getRecharges() {
      return this.httpClient.get<Recharge[]>(this.API_URL + this.ENDPOINT_USER);
    }
   
    GetCategoriesFiltredBy(
      voucherId: string | null,
      msisdn: string | null,
      rechargeAmount: number | null,
      dateRechargeStart: string | null, 
      dateRechargeEnd: string | null,   
      page: number,
      size: number
    ) {
      let params = new HttpParams()
        .set('page', page.toString())
        .set('size', size.toString())
        .set('voucherId', voucherId?.trim() || '')
        .set('msisdn', msisdn?.trim() || '');
    
      params = rechargeAmount !== null ? params.set('rechargeAmount', rechargeAmount.toString()) : params;
      params = dateRechargeStart !== null ? params.set('dateRechargeStart', dateRechargeStart) : params;
      params = dateRechargeEnd !== null ? params.set('dateRechargeEnd', dateRechargeEnd) : params;
    
      return this.httpClient.get<RechargePage>(this.API_URL + this.ENDPOINT_FIND, { params });
    }
  }