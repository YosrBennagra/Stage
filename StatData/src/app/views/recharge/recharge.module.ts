import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RechargeComponent } from './recharge.component';
import { RouterModule, Routes } from '@angular/router';

const routes:Routes=[{path:'',component:RechargeComponent}]
@NgModule({
  declarations: [
    RechargeComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
  ],
  providers: [
  ],
})
export class RechargeModule { }
