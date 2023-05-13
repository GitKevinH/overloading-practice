package org.animal.constructors;

import org.animal.constructors.Animal;
import org.animal.constructors.Book;
import org.animal.constructors.TVShow;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Animal Class
        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> animalList = new ArrayList<>();

        //Objects made for Overloading Practice assignment

        animalList.add(new Animal("cow"));
        animalList.add(new Animal(false));

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop.");

        while (true) {
            System.out.print("Please enter a name: ");
            String animalName = scanner.nextLine();

            if (animalName.equals("")) {
                break;
            }

            System.out.print("Is it a dog? Enter yes or no: ");
            String isDogOrNotStr = scanner.nextLine();
            boolean isDogOrNotBool;

            if(isDogOrNotStr.equalsIgnoreCase("yes")){
                isDogOrNotBool = true;
            }
            else {
                isDogOrNotBool = false;
            }



            animalList.add(new Animal(animalName, isDogOrNotBool));
        }

        //System.out.println(animalList);

        for (Animal animal: animalList) {
            System.out.println(animal);
        }
        System.out.println("--------------------"); //to make it easier to see between classes

        //TV Show Class

        ArrayList<TVShow> tvShowList = new ArrayList<>();

        // adding objects from constructors created from overloading practice
        tvShowList.add(new TVShow("One Piece"));
        tvShowList.add(new TVShow("Dragon Ball Z", 291));
        tvShowList.add(new TVShow(300));
        tvShowList.add(new TVShow(52, "Drama"));
        tvShowList.add(new TVShow("Friends", "Sitcom"));

        System.out.println("Entering nothing will stop the prompts.");

        while (true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if (showName.equals("")) {
                break;
            }

            System.out.println("How many episodes?");
            int showEpisodes  = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String showGenre = scanner.nextLine();


            tvShowList.add(new TVShow(showName,showEpisodes,showGenre)
            );
        }

        for (TVShow shows: tvShowList) {
            System.out.println(shows);
        }
        System.out.println("--------------------"); //to make it easier to see between classes

        //Book Class

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
            System.out.println();
            for (Book book :bookList){
                System.out.println(book);
            }
        }else if (input.equalsIgnoreCase("name")){
            System.out.println();
            for (Book book :bookList){
                System.out.println(book.title);
            }

        }

        //Counter

        Counter counter1 = new Counter();
        System.out.println("Counter 1: " +counter1.value());
        Counter counter2 = new Counter(200);
        System.out.println("Counter 2: " +counter2.value());

        System.out.println("Increasing Counter 1 by 1 ");
        counter1.increase();
        System.out.println("Counter 1: " +counter1.value());
        counter2.decrease();
        System.out.println("Decreasing Counter 2 by 1 ");
        System.out.println("Counter 2: " +counter2.value());

        System.out.print("Enter your number to increase Counter1 by: ");

        int num = Integer.parseInt(scanner.nextLine());
        counter1.increase(num);

        System.out.print("Enter your number to decrease Counter2 by: ");
        num = Integer.parseInt(scanner.nextLine());
        counter2.decrease(num);

        System.out.println("Counter 1: " +counter1.value());
        System.out.println("Counter 2: " +counter2.value());



    }



}
