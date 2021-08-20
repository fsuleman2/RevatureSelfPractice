import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-firstcomp',
  templateUrl: './firstcomp.component.html',
  styleUrls: ['./firstcomp.component.css']
})
export class FirstcompComponent implements OnInit {

  constructor() { }
  @Input() childCount:number = 0;
  //emitter example
  @Output() myName = new EventEmitter<string>(); //angularcore
  ngOnInit(): void {
    // this.myName="suleman";
    }
    myNameChange(event:string){
      console.log(event);
      this.myName.emit(event);
    }

}
