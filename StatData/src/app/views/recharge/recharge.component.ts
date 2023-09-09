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
  constructor(private rechargeService: RechargeService) {}

  ngOnInit(): void {
    this.getRechargeFind();
    const today = new Date();
    const sevenDaysAgo = new Date(today);
    sevenDaysAgo.setDate(today.getDate() - 7);

    // Format the date as YYYY-MM-DD (compatible with the input type "date")
    const formattedDate = sevenDaysAgo.toISOString().split('T')[0];

    // Set the default date for the input field
    this.dateRechargeStart = formattedDate;

  }
  
  getRechargeFind() {
    this.rechargeService.getFilteredRecharges(
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

  getPage(i: number) {
    this.page = i;
    this.getRechargeFind();
  }

clearForm() {
  this.dateRechargeStart = null;
  this.voucherId = '';
  this.rechargeAmount = null;
  this.dateRechargeEnd = null; 
  this.msisdn = '';
}

}
