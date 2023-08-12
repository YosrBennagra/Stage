import { Component } from '@angular/core';
import  {RechargeService} from '../../services/Recharge.service'
import {OnInit} from "@angular/core";

@Component({
  selector: 'app-recharge',
  templateUrl: './recharge.component.html',
  styleUrls: ['./recharge.component.css'],
  providers:[RechargeService]
})
export class RechargeComponent implements OnInit{
  recharges: any [] = [];
  constructor(private RechargeService: RechargeService) {
  }
  ngOnInit(): void {
    console.log('onInit');
    console.log(this.recharges);
    this.RechargeService.getRecharges().subscribe((data: any) => {
      this.recharges = data;
    })

  }
}
