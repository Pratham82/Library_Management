package com.test;

import com.pojo.Book ;

import java.util.Scanner;

public class BookTest {
    public static void main(String []args){
    //Book b= new Book(1550,"Think Straight","Darius Forux",1500);
    int BookID;
    String BookName;
    String BookAuthor;
    double BookPrice;
    Scanner scan = new Scanner(System.in);
    
    //This array will store the values of variables entered
    Book BookArray[] = new Book[50];
    int num =0;
    int OptionChoice;
    char choiceFinal ;
    int numOfBooks;
    int count =0;
    do{
        System.out.println("**** Welcome to Library management *****");
        System.out.println("*********** Options available ***********");
        System.out.println("*********** 1. Add Books ***********\n*********** 2. Update Books ***********\n ***********3. Delete Books ***********\n*********** 4. List all Books ***********");
        System.out.print("Enter your choice: ");
        OptionChoice = scan.nextInt();

        switch(OptionChoice){
            case 1:
                System.out.println("*********** 1. Add books ***********");
                System.out.print("Enter number of books you want to add: ");
                numOfBooks = scan.nextInt();
                for(int i=0;i<numOfBooks;i++){
                    System.out.print("Enter Book ID: ");
                    BookID = scan.nextInt();
                    System.out.print("Enter Book Name: ");
                    BookName = scan.next();
                    System.out.print("Enter Book Author: ");
                    BookAuthor  = scan.next();
                    System.out.print("Enter Book Price: ");
                    BookPrice = scan.nextDouble();
                    BookArray[i] =new Book(BookID,BookName,BookAuthor,BookPrice);
                    count++;
                    System.out.println("********** Successful entry **********");

                }
                System.out.println("*********** Books added successfully!! ***********");
                break;

            case 4:
                System.out.println("*********** 4. List All Books ***********");
                for(int i=0; i<count;i++){
                    System.out.println(BookArray[i]);
                }
                break;
        }//Switch case closed
        //Final choice if you want to continue or not
        System.out.println("Do you want to continue if yes enter 'y'or 'Y' \n Press anything else to terminate");
        choiceFinal = scan.next().charAt(0);
    }while(choiceFinal =='Y'||choiceFinal=='y');
    }
}
