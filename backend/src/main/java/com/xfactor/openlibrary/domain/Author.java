package com.xfactor.openlibrary.domain;

public class Author {
    private int id;
    private String name;
    private String birthDate;
    private String natinoality;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getNatinoality() {
        return natinoality;
    }
    public void setNatinoality(String natinoality) {
        this.natinoality = natinoality;
    }    
}
