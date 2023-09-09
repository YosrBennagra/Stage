import { Component } from '@angular/core';
import  {StockCarteRechargeService} from '../../services/StockCarteRecharge.service'
import {OnInit} from "@angular/core";
import { StockCarteRechargePage } from 'src/app/models/Stock_carte_recharge.model';
@Component({
  selector: 'app-stock-carte-recharge',
  templateUrl: './stock-carte-recharge.component.html',
  styleUrls: ['./stock-carte-recharge.component.css'],
  providers:[StockCarteRechargeService]
})
export class StockCarteRechargeComponent implements OnInit {
  StockCarteRecharges: any[] = [];
  StockCarteRechargefind: StockCarteRechargePage | undefined;
  mois: string | null = null;
  cdDist: string | null = null;
  mntRing: number | null = null;
  nombre: number | null = null;
  page: number = 0;
  size: number = 5;

  constructor(private stockCarteRechargeService: StockCarteRechargeService) {}

  ngOnInit(): void {
    this.getStockCarteRechargefind();
  }
  
  getStockCarteRechargefind() {
    this.stockCarteRechargeService.getFilteredStockCarteRecharges(
      this.mois,
      this.cdDist,
      this.mntRing,
      this.nombre,
      this.page,
      this.size
    ).subscribe((data: StockCarteRechargePage) => {
      this.StockCarteRechargefind = data;
      this.StockCarteRecharges = this.StockCarteRechargefind.content;
    });
  }

  search() {
    this.page = 0;
    this.getStockCarteRechargefind();
  }
  
  formatDateToString(date: Date): string {
    return date.toISOString();
  }
  
  nextPage() {
    if (!this.StockCarteRechargefind?.last) {
      this.page++;
      this.getStockCarteRechargefind();
    }
  }

  previousPage() {
    if (this.page > 0) {
      this.page--;
      this.getStockCarteRechargefind();
    }
  }

  counter() {
    return new Array(this.StockCarteRechargefind?.totalPages);
  }

  getPage(i: number) {
    this.page = i;
    this.getStockCarteRechargefind();
  }

clearForm() {
  this.mois = ''; 
  this.cdDist = ''; 
  this.mntRing = null; 
  this.nombre = null; 
}

}


