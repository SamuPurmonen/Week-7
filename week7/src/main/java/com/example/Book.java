package com.example;

public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;




    public void displayInfo(){

        System.out.println("Nimi: "+ this.title + ", Kirjailija "+ this.author + ", Sivut "+ this.pages + ", Määrä: " + this.copies);
    }

    public abstract String categorize();
}
