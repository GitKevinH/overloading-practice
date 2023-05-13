package org.animal.constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class TVShow {

    //To initialize the class object and run the requirements
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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

    }


    // Class definition
    String showName;
    int numOfEpisodes;
    String genre;

    public TVShow(String showName, int numOfEpisodes, String genre) {
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }
    // Constructors created for Overloading Practice assignment

    public TVShow(String showName) {
        this.showName = showName;
    }

    public TVShow(int numOfEpisodes) {
        this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow(String showName, int numOfEpisodes) {
        this.showName = showName;
        this.numOfEpisodes = numOfEpisodes;
    }

    public TVShow(int numOfEpisodes, String genre) {
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }

    public TVShow(String showName, String genre) {
        this.showName = showName;
        this.genre = genre;
    }
    // end of constructors created for overloading practice assignment

    public String getShowName() {
        return this.showName;
    }

    public int getNumOfEpisodes() {
        return this.numOfEpisodes;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return "The name of the show is "+ this.showName +
                " with " + this.numOfEpisodes +
                " episodes. The genre is " + this.genre +".";
    }


}
