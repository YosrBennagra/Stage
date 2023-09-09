import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DetailLivraison, DetailLivraisonPage } from '../models/Detail_livraison.model';
@Injectable({
    providedIn: 'root'
  })


  export class DetailLivraisonService {
    readonly API_URL = "http://localhost:8081";
    readonly ENDPOINT_FIND = "/getDetailLivraisonFiltredBy";
  
    constructor(private httpClient: HttpClient) { }
  
    getRecharges() {
      return this.httpClient.get<DetailLivraison[]>(this.API_URL + this.ENDPOINT_FIND);
    }
  
    getFilteredDetailLivraison(
      numSer: string | null,
      mntRing: number | null,
      dateLivStart: string | null,
      dateLivEnd: string | null,
      dateFactStart: string | null,
      dateFactEnd: string | null,
      dateRechargeStart: string | null,
      dateRechargeEnd: string | null,
      cdDist: string | null,
      recharge: string | null,
      msisdn: string | null,
      mntDt: number | null,
      flag1: string | null,
      flag2: string | null,
      flag3: string | null,
      flag4: string | null,
      page: number,
      size: number
    ) {
      const filterData = {
        numSer,
        mntRing,
        dateLivStart,
        dateLivEnd,
        dateFactStart,
        dateFactEnd,
        dateRechargeStart,
        dateRechargeEnd,
        cdDist,
        recharge,
        msisdn,
        mntDt,
        flag1,
        flag2,
        flag3,
        flag4
      };
  
      const params = {
        page: page.toString(),
        size: size.toString()
      };
  
      return this.httpClient.post<DetailLivraisonPage>(
        this.API_URL + this.ENDPOINT_FIND,
        filterData,
        { params }
      );
    }
  }