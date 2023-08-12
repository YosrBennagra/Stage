import { Component } from '@angular/core';
import  {StockCarteRechargeService} from '../../services/StockCarteRecharge.service'
import {OnInit} from "@angular/core";

@Component({
  selector: 'app-stock-carte-recharge',
  templateUrl: './stock-carte-recharge.component.html',
  styleUrls: ['./stock-carte-recharge.component.css'],
  providers:[StockCarteRechargeService]
})
export class StockCarteRechargeComponent implements OnInit {
  stockcarterecharges: any [] = [];
  constructor(private StockCarteRechargeService: StockCarteRechargeService) {
  }
  ngOnInit(): void {
    console.log('onInit');
    console.log(this.stockcarterecharges);
    this.StockCarteRechargeService.getStockCarteRecharges().subscribe((data: any) => {
      this.stockcarterecharges = data;
    })

  }
}


