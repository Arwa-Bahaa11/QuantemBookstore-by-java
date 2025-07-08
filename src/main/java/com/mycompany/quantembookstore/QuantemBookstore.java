/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantembookstore;

import java.util.ArrayList;

/**
 *
 * @author Arwaa
 */


///TEST class
public class QuantemBookstore {

    public static void main(String[] args) {
        
        
        Store BookStore = new Store();
        
        paperBook book1 = new paperBook(10,"B11AP","Beauty and the beast",2010,100);
        EBook book2 = new EBook("PDF","C20BE","The Night",2020,150);
        DemoBook book3 = new DemoBook("A30AD","The Moon",2022,50);
        
        paperBook book4 = new paperBook(20,"B11CP","Java",2006,500);
        EBook book5 = new EBook("word","C27DE","The sea",2020,100);
        DemoBook book6 = new DemoBook("A40AD","Live",2022,250);
        
        
        
        
        
        //adding books
        System.out.println("Adding Books");
        System.out.println("-------");
        BookStore.addBook(book1);
        BookStore.addBook(book2);
        BookStore.addBook(book3);
        BookStore.addBook(book4);
        BookStore.addBook(book5);
        BookStore.addBook(book6);
        
        System.out.println("***************");
        
        //buying books
        System.out.println("Buying Books");
        System.out.println("-------");
        double paidAmount=BookStore.buyBook("B11AP", 5, "arwa@gmail.com", "172wwwhhh");
        System.out.println("Paid amount is: "+ paidAmount);
        System.out.println("book stock now: "+book1.stock);
        
        System.out.println("***************");
        
        //buy demo book that is not for sale
        //System.out.println("Buying demo book that is not for sale");
        //System.out.println("-------");
        //BookStore.buyBook("A40AD", 1, "aaa@gmail.com", "12pppppp");
        
        
        // buying quantity over than exist in the stock
        //System.out.println("Buying quantity over than exist in the stock");
        //System.out.println("-------");
        //BookStore.buyBook("B11CP", 30, "aaaa@gmail.com", "1232uuuuuu");
        
        
         System.out.println("***************");
         
         
        //remove outdated books (it passed 10 years)+
        System.out.println("remove outdated books that passed 10 years");
        System.out.println("-------");
       ArrayList<Book> removedBooks =  BookStore.removeBook(10);
       for(Book book:removedBooks){
           System.out.println("Removed books are: " + book.title);
       }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
