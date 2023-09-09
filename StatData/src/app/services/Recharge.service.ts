import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Recharge, RechargePage } from '../models/Recharge.model';

@Injectable({
  providedIn: 'root'
})
export class RechargeService {
  readonly API_URL = "http://localhost:8081";
  readonly ENDPOINT_USER = "/getrecharges";
  readonly ENDPOINT_FIND = "/getRechargeFiltredBy";

  constructor(private httpClient: HttpClient) {}

  getFilteredRecharges(
    voucherId: string | null,
    msisdn: string | null,
    rechargeAmount: number | null,
    dateRechargeStart: string | null,
    dateRechargeEnd: string | null,
    page: number,
    size: number
  ) {
    const filterData = {
      voucherId,
      msisdn,
      rechargeAmount,
      dateRechargeStart,
      dateRechargeEnd
    };

    const params = {
      page: page.toString(),
      size: size.toString()
    };
    console.log(dateRechargeStart);
      console.log(dateRechargeEnd);
    return this.httpClient.post<RechargePage>(
      this.API_URL + this.ENDPOINT_FIND,
      filterData,
      { params }
    );
  }
}
