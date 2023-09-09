import { Component } from '@angular/core';
import {OnInit} from "@angular/core";
import  {DetailLivraisonService} from '../../services/DetailLivraison.service'
import { DetailLivraisonPage } from 'src/app/models/Detail_livraison.model';


@Component({
  selector: 'app-detail-livraison',
  templateUrl: './detail-livraison.component.html',
  styleUrls: ['./detail-livraison.component.css'],
  providers:[DetailLivraisonService]
})
export class DetailLivraisonComponent implements OnInit{
  DetailLivraisons: any[] = [];
  detaillivraisonfind: DetailLivraisonPage | undefined;
  numSer: string | null = null;
  mntRing: number | null = null;
  dateLivStart: string | null = null;
  dateLivEnd: string | null = null;
  dateFactStart: string | null = null;
  dateFactEnd: string | null = null;
  dateRechargeStart: string | null = null;
  dateRechargeEnd: string | null = null;
  cdDist: string | null = null;
  recharge: string | null = null;
  msisdn: string | null = null;
  mntDt: number | null = null;
  flag1: string | null = null;
  flag2: string | null = null;
  flag3: string | null = null;
  flag4: string | null = null;
  page: number = 0;
  size: number = 5;


  constructor(private DetailLivraisonService: DetailLivraisonService) {
  }


  ngOnInit(): void {
    this.getDetailLivraisonFind();
    const today = new Date();
    const sevenDaysAgo = new Date(today);
    sevenDaysAgo.setDate(today.getDate() - 7);

    // Format the date as YYYY-MM-DD (compatible with the input type "date")
    const formattedDate = sevenDaysAgo.toISOString().split('T')[0];

    // Set the default date for the input field
    this.dateLivStart = formattedDate;
    this.dateFactStart = formattedDate;
    this.dateRechargeStart = formattedDate;

  }

  getDetailLivraisonFind() {
    this.DetailLivraisonService.getFilteredDetailLivraison(
      this.numSer,
      this.mntRing,
      this.dateLivStart,
      this.dateLivEnd,
      this.dateFactStart,
      this.dateFactEnd,
      this.dateRechargeStart,
      this.dateRechargeEnd,
      this.cdDist,
      this.recharge,
      this.msisdn,
      this.mntDt,
      this.flag1,
      this.flag2,
      this.flag3,
      this.flag4,
      this.page,
      this.size
    ).subscribe((data: DetailLivraisonPage) => {
      this.detaillivraisonfind = data;
      this.DetailLivraisons = this.detaillivraisonfind.content;
    });
  }

  search() {
    this.page = 0;
    this.getDetailLivraisonFind();
  }
  
  formatDateToString(date: Date): string {
    return date.toISOString();
  }
  
  nextPage() {
    if (!this.detaillivraisonfind?.last) {
      this.page++;
      this.getDetailLivraisonFind();
    }
  }

  previousPage() {
    if (this.page > 0) {
      this.page--;
      this.getDetailLivraisonFind();
    }
  }

  counter() {
    return new Array(this.detaillivraisonfind?.totalPages);
  }

  getPage(i: number) {
    this.page = i;
    this.getDetailLivraisonFind();
  }

clearForm() {
  this.dateLivStart = null;
  this.dateLivEnd = null;
  this.dateFactStart = null;
  this.dateFactEnd = null; 
  this.dateRechargeStart = null; 
  this.dateRechargeEnd = null;
  this.numSer = '';
  this.mntRing = null; 
  this.cdDist = '';
  this.recharge = '';
  this.msisdn = '';
  this.mntDt = null;
  this.flag1 = '';
  this.flag2 = '';
  this.flag3 = '';
  this.flag4 = '';
}
} 
