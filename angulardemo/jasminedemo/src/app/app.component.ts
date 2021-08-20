import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'jasminedemo';
  //testcase function
  add(n1:number,n2:number){
    return n1+n2;
  }
}
