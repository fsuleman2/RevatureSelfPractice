import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bindingdemo',
  templateUrl: './bindingdemo.component.html',
  styleUrls: ['./bindingdemo.component.css']
})
export class BindingdemoComponent implements OnInit {
title:string ='I am StringPolation Title';
imgUrl:string="assets/car.jpg";
value:boolean=false;
username:string=''

  constructor() { }

  ngOnInit(): void {
  }
  changeTitle(){
    this.title = "Event Binding";
  }

}
