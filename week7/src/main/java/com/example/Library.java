package com.example;

import java.util.ArrayList;

public class Library {

    
    ArrayList<Book> booklist = new ArrayList<>();

    public void addBooks(Book book) {
        //lisää kirjan listaan
        booklist.add(book);
        System.out.println("Kirja lisätty kirjastoon!");
    }


    public ArrayList<Book> getBooks() {
            return booklist;
        //palautttaa kirjat

    }

    public void listBooks(){
        
        int amount = 0;

        for (Book book : booklist){
            if (book instanceof FictionBook){
                book.displayInfo();
                
            }
            else if (book instanceof  NonFictionBook){
                book.displayInfo();
                
            }
            System.out.println("Kirjan kategoria: "+ book.categorize());
            amount += book.copies;
        }
        System.out.println("Kirjojen määrä kirjastossa on: " + amount);
        // kutsuu jokaisen kirjan displayInfo.metodia
        //joku for loop jossa kutsutaan Book olion DipsplayInfo metodia

    }
    
    
    

    
}


