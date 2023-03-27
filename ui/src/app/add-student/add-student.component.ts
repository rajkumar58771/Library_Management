import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {
  studentForm: FormGroup;
  constructor(private formbuilder: FormBuilder) { 
    this.studentForm = this.formbuilder.group({
      name:['',Validators.required],
      rollno:['',Validators.required],
      department:['',Validators.required]
    })
  }
  ngOnInit(): void {
  }
}
