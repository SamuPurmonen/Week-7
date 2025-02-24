package com.example;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        FictionBook fb = new FictionBook();
        
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää kirja\r\n" + //
                                "2) Listaa kirjat\r\n" + //
                                "3) Lainaa fiktiokirja\r\n" + //
                                "4) Palauta fiktiokirja\r\n" + //
                                "0) Lopeta ohjelma");
            int i;
            i = Integer.parseInt(sc.nextLine());

            switch(i){

                case 1:
                    System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                    int Input = Integer.parseInt(sc.nextLine());

                    System.out.println("Anna kirjan nimi:");
                    String title = sc.nextLine();

                    System.out.println("Anna kirjailijan nimi:");
                    String author = sc.nextLine();

                    System.out.println("Anna sivumäärä: ");
                    int pages = Integer.parseInt(sc.nextLine());

                    System.out.println("Anna kirjojen määrä: ");
                    int copies = Integer.parseInt(sc.nextLine());
                    
                    if (Input == 1){
                        FictionBook fbook = new FictionBook(title, author, pages, copies);
                        library.addBook(fbook);

                    }else if (Input == 2){
                        NonFictionBook nfbook = new NonFictionBook(title, author, pages, copies);
                        library.addBook(nfbook);

                    }else System.out.println("Väärä syöte.");
                    break;
                
                case 2:
                    library.listBooks();
                    break;

                case 3:
                    System.out.println("Anna lainattavan kirjan nimi:");
                    String bookName = sc.nextLine();
                    
                    
                    
                    fb.borrow(bookName, library);
                    break;
                    

                case 4:
                    System.out.println("Anna palautettavan kirjan nimi:");
                    String bookName2 = sc.nextLine();
                    fb.returnBook(bookName2, library);

                    break;

                case 0:
                    exit = true;
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;

                default:
                    System.out.println("Syöte oli väärä.");
                    break;
            }


        }
        sc.close();
    }
}
