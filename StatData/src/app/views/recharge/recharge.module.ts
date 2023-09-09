import { NgModule } from '@angular/core';
import { CommonModule,DatePipe } from '@angular/common';
import { RechargeComponent } from './recharge.component';
import { RouterModule, Routes } from '@angular/router';
import {InputNumberModule} from 'primeng/inputnumber';
import {CalendarModule} from 'primeng/calendar';
import {TableModule} from 'primeng/table';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms'; 
import {InputTextModule} from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {PaginatorModule} from 'primeng/paginator';

const routes:Routes=[{path:'',component:RechargeComponent}]
@NgModule({
  declarations: [
    RechargeComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    HttpClientModule,
    FormsModule,
    InputTextModule,
    InputNumberModule,
    CalendarModule,
    TableModule,
    ButtonModule,PaginatorModule,

  ],
  providers: [],
})
export class RechargeModule { }  
