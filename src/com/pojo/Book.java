package com.pojo;

public class Book {

    private int BookID;
    private String BookName;
    private String BookAuthor;
    private double BookPrice;

    //Constructor for getting Book details
    public Book(int BookID, String BookName, String BookAuthor, double BookPrice){
            this.BookID = BookID;
            this.BookName = BookName;
            this.BookAuthor = BookAuthor;
            this.BookPrice =BookPrice;
    }

    //To string method for fetching Book details
    public String toString(){
        System.out.println("----------------");
        return "Book details: \nBookID: "+BookID +
                "\nBookName: "+BookName+
                "\nBookAuthor: "+BookAuthor+
                "\nBookPrice: "+BookPrice;

    }

    //Getter and setters for fetching individual elements
    public int getBookID(){
        return BookID;
    }
    public void setBookID(int BookID){
        this.BookID = BookID;
    }
    public String getBookName(){
        return BookName;
    }
    public void setBookName(String BookName){
        this.BookName=BookName;
    }
    public String getBookAuthor(){
        return BookAuthor;
    }
    public void setBookAuthor(String BookAuthor){
        this.BookAuthor = BookAuthor;
    }
    public double getBookPrice(){
        return BookPrice;
    }
    public void setBookPrice(double BookPrice){
        this.BookPrice = BookPrice;
    }

}


