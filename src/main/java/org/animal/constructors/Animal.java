package org.animal.constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    //To initialize the class object and run the requirements
    public static void main(String[] args) {

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

    }


    //defining the class
    String name;
    boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructors created for Overloading Practice assignment

    public Animal(String name) {
        this.name = name;
    }

    public Animal(boolean isDog) {
        this.isDog = isDog;
    }
// end of constructors created for overloading practice assignment

    public String getName() {
        return this.name;
    }

    public boolean isDog() {
        return this.isDog;
    }

    @Override
    public String toString() {
        return this.name + " is a dog = " + this.isDog;
    }
}
