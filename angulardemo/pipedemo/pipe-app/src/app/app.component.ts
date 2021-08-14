import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipe-app';
  marks = 0.67
  salary = 5656.534;
  company = "Suleman"
  job_profile ="DEVELOPER" 
  doj = new Date();
  //propety binding
  username= "sul123";
  radio = "radio";
  checkbox = "checkbox";
  date ="date";
  //even binding
  myName="";
  getPan(){
    // let g = pan;
    alert("button event invoked from .ts file");
  } 
}
