import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { UserFromComponent } from './Component/user-from/user-from.component';


const routes: Routes = [
  { path: 'adduser', component: UserFromComponent },
/*   { path : '', component : } */
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
