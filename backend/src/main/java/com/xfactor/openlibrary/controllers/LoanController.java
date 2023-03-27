package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Loan;


@RestController
@RequestMapping("Loan")

public class LoanController{
    ArrayList <Loan> lLoan= new ArrayList<>();
    @PostMapping("/saveloan")
    public Loan saveBook(@RequestBody Loan Loan){
        lLoan.add(Loan);
        return Loan;
    }
    @GetMapping("/getAll")
    public ArrayList<Loan> getAllLoans(){
    return lLoan;
    }
}