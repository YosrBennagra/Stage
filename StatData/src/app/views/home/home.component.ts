import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  menuList = [true, false, false, false, false];


  constructor(private router: Router, private activatedRoute: ActivatedRoute) {
    if (router.url.includes('detail-livraison')) {
      this.goToPage(1, '');
    } else if (router.url.includes('recharge')) {
      this.goToPage(2, '')
    } else if (router.url.includes('stock-carte-recharge')) {
      this.goToPage(3, '')
    } else if (router.url.includes('useradd')) {
      this.goToPage(4, '')
    } 

  }

  ngOnInit(): void {

  }



  goToPage(i: number, link: string) {
    this.menuList[this.menuList.indexOf(true)] = false;
    if (link != '') {
      this.router.navigate([link]);
    }
    this.menuList[i] = true;
  }
  logout() {
    localStorage.clear();
    /* this.userServ.setUserInfObj(undefined); */
    this.router.navigate([''])
  }
}
