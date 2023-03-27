package com.xfactor.openlibrary.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello/{name}/{age}")
    public HashMap<String,String> sayHi(@PathVariable String name,@PathVariable int age){
        HashMap<String,String> respHashMap = new HashMap<>();
        respHashMap.put("name",name);
        // respHashMap.put(key:"age",age);
        respHashMap.put("age",String.valueOf(age));
        return respHashMap;
    }
}














// @RestController
// public class Hello {
//     @GetMapping("/hello")
//     public String sayHi(@RequestParam String name ,int number){
//         return "Hello" + name + "!!" + "YOur age is " + number;
//     }
// }
