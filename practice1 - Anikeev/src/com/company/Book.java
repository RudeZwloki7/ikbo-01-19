package com.company;

public class Book {
    private String name;
    private String author;

    Book(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String toString() {
        return "Book\n"+"Name:"+getName()+"\nAuthor: "+getAuthor()+"\n";
    }
}
