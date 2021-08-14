import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  isActive:boolean = true;
  isInActive : boolean = false;

  players:string[] = ["Dhoni","Kholi","Siraj"];

  evenNumbers : number[] = [1,2,3,4,5,6,7,8]
  // ngClass
  ngClassName="content2"

  // ngStyleName{"spn1":any};
appear1(){
  this.ngClassName = "content2";
}
appear2(){
  this.ngClassName = "content1";
}
}
