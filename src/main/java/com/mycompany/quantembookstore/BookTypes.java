/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantembookstore;

/**
 *
 * @author Arwaa
 */
 class paperBook extends Book {
     
     int stock;

    public paperBook(int stock, String ISBN, String title, int publishedYear, double price) {
        super(ISBN, title, publishedYear, price, BookTypes.paper);
        this.stock = stock;
    }
    
    @Override
    boolean checkQuantity(int quantity){
      
        return stock>=quantity;
    }
     
    @Override
     void reduceQuantity(int quantity){
       
         stock-=quantity;
     }

    @Override
    void sendBook(int quantity, String email, String address) {
        System.out.println("This book will be shipped to this address "+ address);
    }
     
     
     
     
}


class EBook extends Book{
    
    String fileType;

    public EBook(String fileType, String ISBN, String title, int publishedYear, double price) {
        super(ISBN, title, publishedYear, price, BookTypes.EBook);
        this.fileType = fileType;
    }

    @Override
    boolean checkQuantity(int quantity) {
        return quantity==1;
    }

    @Override
    void reduceQuantity(int quantity) {
        
        System.out.println("This is online book no stock to reduce");
    }

    @Override
    void sendBook(int quantity, String email, String address) {
        System.out.println("This book will be send to this email "+ email);
    }
    
    


}


class DemoBook extends Book{

    public DemoBook(String ISBN, String title, int publishedYear, double price) {
        super(ISBN, title, publishedYear, price, BookTypes.Demo);
    }

    @Override
    boolean checkQuantity(int quantity) {
        throw new IllegalArgumentException("Demo book is not for sale");
    }

    @Override
    void reduceQuantity(int quantity) {
        throw new IllegalArgumentException("Demo book is not for sale");
    }

    @Override
    void sendBook(int quantity, String email, String address) {
      throw new IllegalArgumentException("Demo book is not for sale");
      
    }
    
    
}
