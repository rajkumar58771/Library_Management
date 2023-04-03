package com.xfactor.openlibrary.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Book;
import com.xfactor.openlibrary.repositories.BookRepository;


@RestController
@RequestMapping("book")

public class BookController{
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book){
        if (book.getId() == null) {
            Book book2 = bookRepository.save(book);
            return book2;
        }
        return null;
    }
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        if(book.getId()!=null){
            Book book1 = bookRepository.save(book);
            return book1;
        }
        return null;
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("findById/{id}")
    public Book findById(@PathVariable Long id){
        Optional<Book> optionalOfBook = bookRepository.findById(id);
        if(optionalOfBook.isPresent()){
            return optionalOfBook.get();
        }
        return null;
    }

    @GetMapping("findTotal")
    public Long findTotal(){
        return bookRepository.count();
    }
    @DeleteMapping("delete/{id}")
    public void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }

    @GetMapping("findByisbn/{isbn}")
    public List<Book> findByisbn(@PathVariable String isbn){
        List<Book> book = bookRepository.findByIsbn(isbn);
        return book;
    }
}

// package com.xfactor.openlibrary.controllers;

// import java.util.HashMap;

// import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.PathVariable;
// //import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;
// //import org.springframework.web.bind.annotation.PathVariable;
// // import org.springframework.web.bind.annotation.RequestParam;

// @RestController
// public class BookController {
//     class Book {
//         public String book_name;
//         public String book_author;
//         public int book_isbn_number;
//         public int pages;
//         public int price;
//         public int yop;
//         Book(String name, String author, int isbn, int pages, int price, int yop) {
//             this.book_name = name;
//             this.book_author = author;
//             this.book_isbn_number = isbn;
//             this.pages = pages;
//             this.price = price;
//             this.yop = yop;
//         }
//     }
//     HashMap<String, Object> Book_Data = new HashMap<>();
//     public void setData() {
//         Book b1 = new Book("Numerical Methods", "K. Das",121331,455,200,2011);
//         Book b2 = new Book("Database", "Korth",121332,670,370,2006);
//         Book_Data.put("1", b1);
//         Book_Data.put("2", b2);
//     }
//     public HashMap<String, Object> getBook_Data() {
//         return Book_Data;
//     }
//     public void setBook_Data(HashMap<String, Object> book_Data) {
//         Book_Data = book_Data;
//     }
//     @GetMapping("/getallbooks")
//     public HashMap<String, Object> getAllBooks() {
//         setData();
//         return Book_Data;
//     }
// }










