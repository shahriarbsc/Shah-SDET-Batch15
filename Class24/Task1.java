package Class24;

import class1.Main;

public class Task1 {

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

    public static void main(String[] args) {

        Computer[] computers = {new Apple(), new HP()};

        for (Computer c : computers) {
            c.playVideo();   // calling methods
            c.browserInternet();

            if (c instanceof Apple) { // we are checking if the variable c contains of an object of an Apple class

                Apple apple = (Apple) c; // converting the variable
                apple.installApp();
                apple.editVideos();


            }

        }
    }
}

class Computer {

    int RAM;
    int storage;
    String OS;


    void playVideo() {

        System.out.println("Video is playing");
    }

    void browserInternet() {

        System.out.println("Browse the internet");
    }

}

class Apple extends Computer {

    void playVideo() {

        System.out.println("Playing the video on quick time player");
    }

    void browserInternet() {

        System.out.println("Browsing the internet using safari");
    }

    void editVideos() {

        System.out.println("Editing in iMovies");

    }

    void installApp() {

        System.out.println("installing the apps from App store");
    }

}

class HP extends Computer {

    void browserInternet() {

        System.out.println("Browsing using chrome");
    }

    void playVideos() {

        System.out.println("playing ");
    }

}