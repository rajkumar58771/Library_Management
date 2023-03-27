import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-add-admin',
  templateUrl: './add-admin.component.html',
  styleUrls: ['./add-admin.component.css']
})
export class AddAdminComponent implements OnInit {
  adminForm:FormGroup;
  constructor(private formbulider:FormBuilder) {
    this.adminForm = this.formbulider.group({
      
    })
   }

  ngOnInit(): void {
  }

}
