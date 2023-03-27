package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Publisher;

@RestController
@RequestMapping("publisher")

public class PublisherController{
    ArrayList <Publisher> lpublisher= new ArrayList<>();
    @PostMapping("/savePublisher")
    public Publisher savePublisher(@RequestBody Publisher publisher){
        lpublisher.add(publisher);
        return publisher;
    }
    @GetMapping("/getAll")
    public ArrayList<Publisher> getAllPublisher(){
        return lpublisher;
    }
}