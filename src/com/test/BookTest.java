package com.test;

import com.pojo.Book;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        //Book b= new Book(1550,"Think Straight","Darius Forux",1500);
        int BookID;
        String BookName;
        String BookAuthor;
        double BookPrice;
        Scanner scan = new Scanner(System.in);

        //This array will store the values of variables entered
        Book BookArray[] = new Book[50];
        int num = 0;
        int OptionChoice;
        char choiceFinal;
        int numOfBooks;
        int count = 0;
        char delChoice;
        int nullCount = 0;
        do {
            System.out.println("**** Welcome to Library management ****");
            System.out.println("*********** Options available *********");
            System.out.println("*********** 1. Add Books **************");
            System.out.println("*********** 2. Update Books ***********");
            System.out.println("*********** 3. Delete Books ***********");
            System.out.println("*********** 4. List all Books *********");
            System.out.println("*********** 5. Search Books ***********");
            System.out.print("Enter your choice: ");
            OptionChoice = scan.nextInt();

            switch (OptionChoice) {

                case 1:
                    System.out.println("*********** 1. Add books ***********");
                    System.out.print("Enter number of books you want to add: ");
                    numOfBooks = scan.nextInt();
                    for (int i = 0; i < numOfBooks; i++) {
                        System.out.print("Enter Book ID: ");
                        BookID = scan.nextInt();
                        System.out.print("Enter Book Name: ");
                        BookName = scan.next();
                        System.out.print("Enter Book Author: ");
                        BookAuthor = scan.next();
                        System.out.print("Enter Book Price: ");
                        BookPrice = scan.nextDouble();
                        BookArray[i] = new Book(BookID, BookName, BookAuthor, BookPrice);
                        count++;
                        System.out.println("********** Successful entry **********");

                    }
                    System.out.println("******* Books added successfully!! ******");
                    break;

                case 3:
                    System.out.println("*********** 3. Delete Books ***********");
                    if (count > 0) {
                        System.out.print("Enter Book ID: ");
                        BookID = scan.nextInt();
                        for (int i = 0; i < count; i++) {
                            if (BookArray[i] != null) {
                                if (BookID == BookArray[i].getBookID()) {
                                    System.out.println("Book found");
                                    System.out.println("Do you really want to delete the book??\nIf yes enter 'y'or'Y'");
                                    delChoice = scan.next().charAt(0);
                                    if (delChoice == 'y' || delChoice == 'Y') {
                                        BookArray[i] = null;
                                        System.out.println("Book successfully deleted");
                                    } else if (delChoice == 'n' || delChoice == 'N') {
                                        System.out.println("Operation aborted");
                                    }

                                }
                            } else {
                                System.out.println("Books not available for deleting");
                            }

                        }
                    } else {
                        System.out.println("No books to delete");
                    }
                    break;

                case 4:
                    System.out.println("*********** 4. List All Books ***********");
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            if (BookArray[i] == null) {
                                nullCount++;
                            }
                            if (nullCount > 0) {
                                System.out.println("All books are deleted");
                            }
                        }
                        for (int i = 0; i < count; i++) {

                            if (BookArray[i] != null) {
                                System.out.println(BookArray[i]);
                            }

                        }
                    } else {
                        System.out.println("Book list is empty");
                    }
                    break;

                case 5:
                    System.out.println("*********** 5. Search Books ***********");
                    if (count != 0) {
                        System.out.print("Enter book ID: ");
                        BookID = scan.nextInt();
                        for (int i = 0; i < count; i++) {
                            if (BookID == BookArray[i].getBookID()) {
                                System.out.println("Book found");
                                System.out.println(BookArray[i]);
                            } else {
                                System.out.println("Book ID not found please enter valid book ID");
                            }
                        }
                    } else {
                        System.out.println("No books are here to search");
                    }
                    break;
                    
            /*default:
                System.out.println("Please provide valid input");*/
            }//Switch case closed
            //Final choice if you want to continue or not
            System.out.println("---------------------------------------------");
            System.out.println("Do you want to continue if yes enter 'y'or 'Y' \n Press anything else to terminate");
            System.out.println("---------------------------------------------");
            choiceFinal = scan.next().charAt(0);
        } while (choiceFinal == 'Y' || choiceFinal == 'y');
    }
}
