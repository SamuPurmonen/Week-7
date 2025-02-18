package com.example;

public interface Borrowable {


    

    public void borrow(String bookName, Library library);
    public void returnBook(String bookName, Library library);

    public void borrow();
    public void returnBook();
}
