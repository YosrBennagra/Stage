import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RouterModule, Routes } from '@angular/router';
import { DetailLivraisonComponent } from './detail-livraison.component';

const routes:Routes=[{path:'',component: DetailLivraisonComponent}]
@NgModule({
  declarations: [
    DetailLivraisonComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
  ],
  providers: [
  ],
})
export class DetailLivraisonModule { }
