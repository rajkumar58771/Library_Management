import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-books',
  templateUrl: './add-books.component.html',
  styleUrls: ['./add-books.component.css']
})
export class AddBooksComponent implements OnInit {
  booksForm : FormGroup;
  constructor(private formbuilder: FormBuilder, private http: HttpClient, private router: Router ) { 
    this.booksForm = this.formbuilder.group({
      title: [''],
      author: [''],
      isbn: [''],
      publication: [],
      publisher: [],
      copies: [],
      category: [],
      genre: [],
      subgenre: []
    })
  }
  ngOnInit(): void {
  }
  saveBook(){
    // Make Post call to request url http://localhost:8081/books/saveBook

    let bookData = this.booksForm.value;
    // Handle date to string
    this.http.post('http://localhost:8080/book/saveBook',bookData)
    .subscribe(response => {
      console.log('Book saved to DB', response)
      this.router.navigateByUrl('/book')
    }, error =>{
      console.error("Error in book sagggve", error)
    }
    );
}
}
