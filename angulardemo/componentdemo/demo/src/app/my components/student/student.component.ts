import { Component, Input, OnInit } from '@angular/core';
import { Teacher } from 'src/app/Teacher';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  @Input()
  teacher: Teacher | undefined;
  @Input('principle')
  principleName!: String;
  constructor() { }

  ngOnInit(): void {
  }

}
