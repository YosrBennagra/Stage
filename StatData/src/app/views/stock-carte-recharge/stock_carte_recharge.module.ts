import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RouterModule, Routes } from '@angular/router';
import { StockCarteRechargeComponent } from './stock-carte-recharge.component';

const routes:Routes=[{path:'',component:StockCarteRechargeComponent}]
@NgModule({
  declarations: [
    StockCarteRechargeComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
  ],
  providers: [
  ],
})
export class StockCarteRechargeModule { }
