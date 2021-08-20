import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstcompComponent } from './firstcomp/firstcomp.component';
// import { SecondcompComponent } from './secondcomp/secondcomp.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstcompComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
