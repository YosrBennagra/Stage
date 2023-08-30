import { Component } from '@angular/core';
import {OnInit} from "@angular/core";
import  {DetailLivraisonService} from '../../services/DetailLivraison.service'


@Component({
  selector: 'app-detail-livraison',
  templateUrl: './detail-livraison.component.html',
  styleUrls: ['./detail-livraison.component.css'],
  providers:[DetailLivraisonService]
})
export class DetailLivraisonComponent implements OnInit{
  detaillivraisons: any [] = [];
  constructor(private DetailLivraisonService: DetailLivraisonService) {
  }
  ngOnInit(): void {
    console.log('onInit');
    console.log(this.detaillivraisons);
    this.DetailLivraisonService.getDetailLivraisons().subscribe((data: any) => {
      this.detaillivraisons = data;
    })
  }
} 
