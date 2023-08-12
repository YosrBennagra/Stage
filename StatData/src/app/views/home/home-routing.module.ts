import {RouterModule, Routes} from "@angular/router";
import {HomeComponent} from "./home.component";
import {NgModule} from "@angular/core";

const routes: Routes = [{
  path: '', component: HomeComponent, children: 
  [
    {path: 'recharge',loadChildren: () => import('../recharge/recharge.module').then(m => m.RechargeModule)},
    {path: 'detail-livraison',loadChildren: () => import('../detail-livraison/detail_livraison.module').then(m => m.DetailLivraisonModule)},
    {path: 'stock-carte-recharge',loadChildren: () => import('../stock-carte-recharge/stock_carte_recharge.module').then(m => m.StockCarteRechargeModule)},
  ]
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule {

}
