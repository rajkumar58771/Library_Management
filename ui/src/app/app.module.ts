import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookComponent } from './book/book.component';
import { AuthorComponent } from './author/author.component';
import { AdminComponent } from './admin/admin.component';
import { PublisherComponent } from './publisher/publisher.component';
import { StudentComponent } from './student/student.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { HomeComponent } from './home/home.component';
import { AddAdminComponent } from './add-admin/add-admin.component';
import { AddBooksComponent } from './add-books/add-books.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddStudentComponent } from './add-student/add-student.component';


@NgModule({
  declarations: [
    AppComponent,
    BookComponent,
    AuthorComponent,
    AdminComponent,
    PublisherComponent,
    StudentComponent,
    SidenavComponent,
    HomeComponent,
    AddAdminComponent,
    AddBooksComponent,
    AddStudentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
