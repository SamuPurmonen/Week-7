package com.example;

public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;




    public void displayInfo(){
        //tähän tulee todennäköisesti joku arraylistia lukeva looppijolla käydään kirjojen tiedot läpi
        //tai sille annetaan jo valittu Book olio
        System.out.println("Nimi: "+ this.title + ", Kirjailija "+ this.author + ", Sivut "+ this.pages + ", Määrä: " + this.copies);
    }

    public abstract String categorize();
}
