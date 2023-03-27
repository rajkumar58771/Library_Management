package com.xfactor.openlibrary.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")

public class StudentController{
    // ArrayList <Student> lstudent= new ArrayList<>();
    // @PostMapping("/saveStudent")
    // public Student saveStudent(@RequestBody Student student){
    //     lstudent.add(student);
    //     return student;
    // }
    // @GetMapping("/getAll")
    // public ArrayList<Student> getAllStudent(){
    //     return lstudent;
    // }
}





// package com.xfactor.openlibrary.controllers;

// import java.util.HashMap;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// // import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;
// // import org.springframework.web.bind.annotation.PathVariable;
// // import org.springframework.web.bind.annotation.RequestParam;

// @RestController
// public class StudentController {
//     class Student {
//          public String name;
//          public int age;
//          public String dept;
//          public int roll;
//         Student(String name, int age, String dept, int roll) {
//             this.name = name;
//             this.age = age;
//             this.dept = dept;
//             this.roll = roll;
//         }
//     }
//     HashMap<String, Object> studentData = new HashMap<>();
//     public void setData() {
//         Student s1 = new Student("Martin Garrix", 20, "CSE", 13);
//         Student s2 = new Student("Messi", 21, "EE", 23);
//         Student s3 = new Student("Zedd", 22, "AIML", 33);
//         Student s4 = new Student("Ronaldo", 33, "IT", 11);  

//         studentData.put("1", s1);
//         studentData.put("2", s2);
//         studentData.put("3", s3);
//         studentData.put("4", s4);
//     }
//     @GetMapping("/getallstudents")
//     public HashMap<String, Object> getAllStudents() {
//         setData();
//         return studentData;
//     }
//     @GetMapping("/getstudents/{id}")
//     public Object getStudentsById(@PathVariable String id) {
//         setData();
//         if (studentData.keySet().contains(id)) {
//             return studentData.get(id);
//         }
//         return null;
//     }
// }