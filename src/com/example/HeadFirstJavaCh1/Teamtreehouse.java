package com.example.HeadFirstJavaCh1;

public class Teamtreehouse {

    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
        String firstName = console.readLine("What is your name? ");
        //this is an example of camelCase
        console.printf ("Hello, my name is %s\n", firstName);
        console.printf ("%s is learning how to write Java\n", firstName);

        String firstName = console.readLine("What is your fisrt name?");
        String lastName = console.readLine("What is your last name?");

        console.printf ("First name: %s\n",firstName);
        console.printf ("Last name: %s\n",lastName);

    }

}
