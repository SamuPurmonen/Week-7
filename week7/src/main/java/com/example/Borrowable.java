package com.example;

public interface Borrowable {
    
    void borrow(String bookName, Library library);
    void returnBook(String bookName, Library library);
}
