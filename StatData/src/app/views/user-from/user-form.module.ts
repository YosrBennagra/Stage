import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { UserFromComponent } from './user-from.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {InputTextModule} from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';


const routes:Routes=[{path:'',component:UserFromComponent}]
@NgModule({
  declarations: [
    UserFromComponent,
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    HttpClientModule, 
    FormsModule,
    ReactiveFormsModule,InputTextModule,ButtonModule
  ],
  providers: [],
})
export class UserFormModule { } 