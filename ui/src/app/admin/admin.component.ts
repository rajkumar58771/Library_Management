import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  number = [10,20,30,40,50,60,70,80]
  constructor(private router :Router) { }

  ngOnInit(): void {
  }
  addAdmin(){
    console.log("addAdmin button clicked!!")
    // Take user to /add-books url
    this.router.navigateByUrl('/add-admin')
  }

}
