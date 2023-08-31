import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DetailLivraison } from '../models/detail_livraison.model';
@Injectable({
    providedIn: 'root'
  })


  export class DetailLivraisonService {
    readonly API_URL = "http://localhost:8081";
    readonly ENDPOINT_USER = "/get_detail_livraison";
  
    constructor(private httpClient: HttpClient) { }
  
    getDetailLivraisons() {
      return this.httpClient.get<DetailLivraison[]>(this.API_URL + this.ENDPOINT_USER);
    }
  
  }