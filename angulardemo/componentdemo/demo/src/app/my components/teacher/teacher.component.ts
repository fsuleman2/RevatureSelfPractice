import { Component, OnInit } from '@angular/core';
import { Teacher, Teachers } from 'src/app/Teacher';

@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.css']
})
export class TeacherComponent implements OnInit {

  teachers = [
    {name: 'Mr. Deep',subject:'Angular 6 in DotNet Techy YouTube Channel'},
    {name: 'Mr. Gautam' ,subject:'C#, WEB API in DotNet Techy YouTube Channel'},
    {name: 'Mr. DotNet Techy' ,subject:'High chart, chart js, prime ng, ag grid in DotNet Techy YouTube Channel '}
    ];
  principle = 'Principle';
  constructor() { }

  ngOnInit(): void {
  }

}
