import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorComponent } from './author/author.component';
import { BookComponent } from './book/book.component';
import { PublisherComponent } from './publisher/publisher.component';
import { StudentComponent } from './student/student.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { AddBooksComponent } from './add-books/add-books.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { AddAdminComponent } from './add-admin/add-admin.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'book',
    component: BookComponent,
  },
  {
    path: 'admin',
    component: AdminComponent,
  },
  {
    path: 'student',
    component: StudentComponent,
  },
  {
    path: 'publisher',
    component: PublisherComponent,
  },
  {
    path: 'add-books',
    component: AddBooksComponent,
  },
  {
    path: 'add-student',
    component: AddStudentComponent,
  },
  {
    path: 'add-admin',
    component: AddAdminComponent,
  },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
