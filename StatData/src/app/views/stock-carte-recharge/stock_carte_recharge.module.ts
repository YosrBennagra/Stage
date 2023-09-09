import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { StockCarteRechargeComponent } from './stock-carte-recharge.component';
import {InputNumberModule} from 'primeng/inputnumber';
import {CalendarModule} from 'primeng/calendar';
import { FormsModule } from '@angular/forms'; 
import {InputTextModule} from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {PaginatorModule} from 'primeng/paginator';

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
    FormsModule,
    InputTextModule,
    InputNumberModule,
    CalendarModule,
    TableModule,
    ButtonModule,PaginatorModule
    
  ],
  providers: [
  ],
})
export class StockCarteRechargeModule { } 
