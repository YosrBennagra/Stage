import { Component, OnInit } from '@angular/core';
import { RechargeService } from '../../services/Recharge.service';
import { RechargePage } from 'src/app/models/Recharge.model';

@Component({
  selector: 'app-recharge',
  templateUrl: './recharge.component.html',
  styleUrls: ['./recharge.component.css'],
  providers: [RechargeService]
})
export class RechargeComponent implements OnInit {
  recharges: any[] = [];
  rechargefind: RechargePage | undefined;
  voucherId: string | null = null;
  msisdn: string | null = null;
  rechargeAmount: number | null = null;
  dateRechargeStart: string | null = null;
  dateRechargeEnd: string | null = null;
  page: number = 0;
  size: number = 5;

  constructor(private RechargeService: RechargeService) {this.dateRechargeStart = null;}

  ngOnInit(): void {
    console.log('onInit');
    this.getRechargeFind();
    console.log(this.recharges);
  }
  
  getRechargeFind() {
    this.RechargeService.GetCategoriesFiltredBy(
      this.voucherId,
      this.msisdn,
      this.rechargeAmount,
      this.dateRechargeStart,
      this.dateRechargeEnd,
      this.page,
      this.size
    ).subscribe((data: RechargePage) => {
      this.rechargefind = data;
      this.recharges = this.rechargefind.content;
    });
  }

  search() {
    this.page = 0;
    this.getRechargeFind();
  }
  
  formatDateToString(date: Date): string {
    return date.toISOString();
  }
  
  nextPage() {
    if (!this.rechargefind?.last) {
      this.page++;
      this.getRechargeFind();
    }
  }

  previousPage() {
    if (this.page > 0) {
      this.page--;
      this.getRechargeFind();
    }
  }

  counter() {
    return new Array(this.rechargefind?.totalPages);
  }

  GetPage(i: number) {
    this.page = i;
    this.getRechargeFind();
  }
}
