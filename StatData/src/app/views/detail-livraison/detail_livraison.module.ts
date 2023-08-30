import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TableModule } from 'primeng/table';
import { HttpClientModule } from '@angular/common/http';
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
    TableModule,
    HttpClientModule,
  ],
  providers: [
  ],
})
export class DetailLivraisonModule { }
