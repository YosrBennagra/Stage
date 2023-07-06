import { Component } from '@angular/core';
import  {UService} from './u.service'
import {OnInit} from "@angular/core";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[ UService]
})
export class AppComponent implements OnInit{
  title = 'Stageng15v2';
  users: any [] = [];
  constructor(private UService: UService) {
  }
  
  ngOnInit(): void {
    console.log('onInit')
    this.UService.getUsers().subscribe((data: any) => {
      this.users = data;
    })
  }
}
