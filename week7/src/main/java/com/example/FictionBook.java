package com.example;

public class FictionBook extends Book implements Borrowable {

    

    public FictionBook(String title, String author, int pages, int copies){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
        this.copiesMax = copies;

    }

    public FictionBook(){

    }


    @Override
    public String categorize(){
        return "Fiktiokirja";

    }


   
    
    
    
    public void borrow(String bookName, Library library){
        boolean foundBook = false;
        
        for (Book book : library.getBooks()){
            if (book instanceof  FictionBook && book.title.equalsIgnoreCase(bookName)){
                if (book.copies >= 1){
                    book.copies -= 1;
                    System.out.println("Kirja " +book.title+ " on nyt lainattu.");
                    
                }
                else{
                    System.out.println("Kirjaa " + book.title +" ei enään ole lainattavissa!");
                }
                foundBook = true;
            }
                

        }
        if (foundBook == false){
            System.out.println("Kirjaa ei löytynyt tai sitä ei voi lainata.");
        }//tosi epätehokas mutta ainut mitä keksin
        
    }
    
    
    
    public void returnBook(String bookName, Library library){
        
        
        boolean foundBook = false;
        
        for (Book book : library.getBooks()){
            if (book instanceof  FictionBook && book.title.equalsIgnoreCase(bookName)){
                

                if (book.copies == book.copiesMax){
                    System.out.println("Kirja "+book.title +" ei ole lainassa.");
                    foundBook = true;
                } else{
                System.out.println("Kirja "+ book.title +" on palautettu.");
                book.copies +=1;
                foundBook = true;
                }
            }
        }
        if (foundBook == false){
            System.out.println("Kirja "+ bookName +" ei ole lainassa.");
        
        }

    
}
}
