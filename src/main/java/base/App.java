package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        myApp.promptUser();
        String name = myApp.readName();
        String outputString = myApp.createOutputString(name);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String createOutputString(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }

    public void promptUser() {
        System.out.println("What is your name? ");
    }

    public String readName() {
        return in.nextLine();
    }
}
