import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //title = 'publishersubcriberdemo';
  count:number = 10;
  incrementCount(){
    this.count++;
  }
  decrementCount(){
this.count--;
  }
}
