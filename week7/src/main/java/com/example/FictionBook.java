package com.example;

public class FictionBook extends Book implements Borrowable {

    

    public FictionBook(String title, String author, int pages, int copies){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;

    }



    @Override
    public String categorize(){
        return "Fiktiokirja";

    }

    public void borrow(){
        //tarkastaa kopioden määrän ja tulostaa
        System.out.println("Kirja X on nyt lainattu.");
        //tai
        System.out.println("Kirjaa X ei enään ole lainattavissa!");

    }

    public void returnBook(){
        //kirjaa palauttausessa tulostaa
        System.out.println("Kirja X on palautettu.");
        //tai
        System.out.println("Kirja X ei ole lainassa.");
    }
}
