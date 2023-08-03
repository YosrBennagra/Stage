import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserFromComponent } from './Component/user-from/user-from.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { TableModule } from 'primeng/table';
import { UpdateuserComponent } from './Component/updateuser/updateuser.component';


@NgModule({
  declarations: [
    AppComponent,
    UserFromComponent,
    UpdateuserComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule, 
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    TableModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
