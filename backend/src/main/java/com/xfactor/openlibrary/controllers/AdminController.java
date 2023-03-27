package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Admin;


@RestController
@RequestMapping("admin")

public class AdminController{
    ArrayList<Admin> lAdmin= new ArrayList<>();
    @PostMapping("/saveadmin")
    public Admin saveAdmin(@RequestBody Admin admin){
        lAdmin.add(admin);
        return admin;
    }
    @GetMapping("/getAll")
    public ArrayList<Admin> getAllAdmin(){
        return lAdmin;
    }
}