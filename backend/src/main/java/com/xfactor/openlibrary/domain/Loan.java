package com.xfactor.openlibrary.domain;

public class Loan {
    private int id;
    private int bookid;
    private int studentid;
    private String checkoutDate;
    private String returnDate;
    private String dueDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getCheckoutDate() {
        return checkoutDate;
    }
    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
