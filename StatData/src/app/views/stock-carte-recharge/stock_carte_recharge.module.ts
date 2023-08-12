import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
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
    TableModule,
    HttpClientModule,
  ],
  providers: [
  ],
})
export class StockCarteRechargeModule { }
