import { NgModule } from '@angular/core';
import { CommonModule,DatePipe } from '@angular/common';
import { RechargeComponent } from './recharge.component';
import { RouterModule, Routes } from '@angular/router';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms'; 

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
    FormsModule
  ],
  providers: [],
})
export class RechargeModule { }  
