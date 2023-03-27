import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  Title = 'Student Details'
  studentdetail = [ {"id": 1,"name":"Raj Kumar Shaw","studentID": "A101","department":"CSE","rollno":"12200120017","mobile":"7439482331","email": 'rajkumarshaw58771@gmail.com',"address":"88b","pincode": "700042"},{"id": 2,"name":"Rohit Shaw","studentID": "A102","department":"CSE","rollno":"12200120099","mobile":"7980649884","email": 'rajshaw58771@gmail.com',"address":"115/52","pincode": "700039"},{"id": 3,"name":"Supriti Kole","studentID": "A103","department":"CSE","rollno":"12200120016","mobile":"8116876825","email": 'supritikole5602@gmail.com',"address":"512/E","pincode": "712601"},{"id": 4,"name":"Abhishek Roy","studentID": "A104","department":"CSE","rollno":"12200120045","mobile":"7439448387","email": 'abhishekroy4g@gmail.com',"address":"1a","pincode": "700001"},]
  constructor(private router :Router) { }

  ngOnInit(): void {
  }
  addStudent(){
    console.log("addStudent button clicked!!")
    // Take user to /add-books url
    this.router.navigateByUrl('/add-student')
  }

}
