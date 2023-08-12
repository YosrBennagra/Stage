import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RechargeComponent } from './recharge.component';
import { RouterModule, Routes } from '@angular/router';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';


const routes:Routes=[{path:'',component:RechargeComponent}]
@NgModule({
  declarations: [
    RechargeComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    TableModule,
    HttpClientModule,
  ],
  providers: [],
})
export class RechargeModule { } 
