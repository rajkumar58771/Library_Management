package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Author;


@RestController
@RequestMapping("author")

public class AuthorController{
    ArrayList <Author> lauthor= new ArrayList<>();
    @PostMapping("/saveAuthor")
    public Author saveAuthor(@RequestBody Author author){
        lauthor.add(author);
        return author;
    }
    @GetMapping("/getAll")
    public ArrayList<Author> getAllBooks(){
    return lauthor;
    }
}













// package com.xfactor.openlibrary.controllers;

// import java.util.HashMap;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// //import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;
// //import org.springframework.web.bind.annotation.PathVariable;
// // import org.springframework.web.bind.annotation.RequestParam;

// @RestController
// public class AuthorController {
//     class Author {
//         public String author_name;
//         public int author_age;
//         Author(String name, int age) {
//             this.author_name = name;
//             this.author_age = age;
//         }
//     }
//     HashMap<String, Object> Author_Data = new HashMap<>();
//     public void setData() {
//         Author at1 = new Author("HC Verma", 55);
//         Author at2 = new Author("Kanetkar", 45);
//         Author at3 = new Author("Lipschutz", 50);
//         Author at4 = new Author("Cormen", 46);

//         Author_Data.put("1", at1);
//         Author_Data.put("2", at2);
//         Author_Data.put("3", at3);
//         Author_Data.put("4", at4);
//     }
//     @GetMapping("/getallauthors")
//     public HashMap<String, Object> getAllAuthors() {
//         setData();
//         return Author_Data;
//     }
//     @GetMapping("/getauthor/{id}")
//     public Object getAuthorsById(@PathVariable String id) {
//         setData();
//         if (Author_Data.keySet().contains(id)) {
//             return Author_Data.get(id);
//         }
//         return null;
//     }
// }




