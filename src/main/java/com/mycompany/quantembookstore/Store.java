/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantembookstore;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Arwa
 */
public class Store {
    
    
    // function to add books
    Map<String,Book> inventory = new HashMap<>();
    void addBook(Book newBook){
        
        inventory.put(newBook.ISBN, newBook);
        
        System.out.println("Book "+ newBook.title+ " is added ");
        
        }
    
    // function to remove books
    ArrayList<Book> removedBooks=new ArrayList<>();
   
    ArrayList<Book> removeBook(int passedYears){
         Iterator<Map.Entry<String,Book>> iterator = inventory.entrySet().iterator();
        
        
      int currentYear=Year.now().getValue();
       while(iterator.hasNext()){
           Book book=iterator.next().getValue();
           if(currentYear-book.publishedYear >= passedYears){
               
               removedBooks.add(book);
               iterator.remove();
               System.out.println("Book removed");
               
           
           }
       
       }
       
       return removedBooks;
        
        
    
    }
    
    
    // function to buy books
    
    double buyBook(String ISBN,int quantity,String email,String address){
        
        if(!inventory.containsKey(ISBN)){
            
            throw new IllegalArgumentException("Book is not avalible in the store !");
        }
        
        Book book=inventory.get(ISBN);
        if(!book.isSold()){
        
            throw new IllegalArgumentException("Demo book is not for sale");
        }
        
        
        if(!book.checkQuantity(quantity)){
            
            throw new IllegalArgumentException("This quantity is not avalible");
        
        }
        
        book.reduceQuantity(quantity);
        book.sendBook(quantity, email, address);
        
    
       double paidAmount= book.price*quantity;
       
       return paidAmount;
    }
    
    
    
    
    
    
    
    
    
    
}
