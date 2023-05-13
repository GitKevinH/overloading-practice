package org.animal.constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    //To initialize the class object and run the requirements
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        //adding 3 instances of book
        bookList.add(new Book("The Intelligent Investor", 623,1949));
        bookList.add(new Book("How to Win Friends and Influence People", 288,1936));
        bookList.add(new Book("Rich Dad, Poor Dad",195,1997));

        // adding objects from constructors created from overloading practice
        bookList.add(new Book(200));
        bookList.add(new Book("The Hobbit"));
        bookList.add(new Book(223, 1994));
        bookList.add(new Book("The Road", 2006));
        bookList.add(new Book(1949, "Nineteen Eighty-Four"));

        //prompting user
        System.out.println("Entering nothing as the book title will stop the prompts.");

        while(true){

            System.out.println("What is the book's title?");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {
                break;
            }

            System.out.println("How many pages does the book have?");
            int bookPages = Integer.parseInt(scanner.nextLine());

            System.out.println("When was the book published?");
            int bookPublished = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(bookTitle,bookPages,bookPublished));
        }

        System.out.println("What do you want to have printed? Enter 'everything' for all of the book information or 'name' for just the book titles.");
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("everything")){
            for (Book book :bookList){
                System.out.println(book);
            }
        }else if (input.equalsIgnoreCase("name")){
            for (Book book :bookList){
                System.out.println(book.title);
            }

        }




    }

    //class definitions
    String title;
    int pages;
    int published;

    public Book(String title, int pages, int published) {
        this.title = title;
        this.pages = pages;
        this.published = published;
    }
    // Constructors created for Overloading Practice assignment

    public Book(String title) {
        this.title = title;
    }

    public Book(int pages) {
        this.pages = pages;
    }

    public Book( int pages, String title) {
        this.title = title;
        this.pages = pages;
    }

    public Book(String title, int published) {
        this.title = title;
        this.published = published;
    }

    public Book(int pages, int published) {
        this.pages = pages;
        this.published = published;
    }

    // end of constructors created for overloading practice assignment

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublication() {
        return this.published;
    }

    @Override
    public String toString() {
        return this.title +", "+this.pages+"pages, "+this.published;
    }
}
