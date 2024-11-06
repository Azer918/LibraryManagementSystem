/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CS151.librarymanagementsystem;

/**
 *
 * @author brand
 */
public class Book 
{
    String author;
    String title;
    String isbn;
    public Book(String author, String title, String isbn)
    {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public String toString()
    {        
        return "Book{Title='" + title + "', Author='" + author + "', ISBN='" + isbn + "'}";
    }
}
