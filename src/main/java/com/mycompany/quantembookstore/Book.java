/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantembookstore;

/**
 *
 * @author Arwaa
 */
abstract class Book {
    
    String ISBN;
    String title;
    int publishedYear;
    double price;
    BookTypes bookType;
    
    

    public Book(String ISBN, String title, int publishedYear, double price, BookTypes bookType) {
        this.ISBN = ISBN;
        this.title = title;
        this.publishedYear = publishedYear;
        this.price = price;
        this.bookType = bookType;
    }
    
    
    boolean isSold(){
        
        return this.bookType!=BookTypes.Demo;
    }
    
     abstract boolean checkQuantity(int quantity);
     abstract void reduceQuantity(int quantity);
     abstract void sendBook(int quantity,String email,String address);
    
    
    protected enum BookTypes {paper,EBook,Demo};

    
    
    
  
    
    
}

 
interface sold{
    double sellSingleBook(String ISBN,int quantity,String email,String address);

}
