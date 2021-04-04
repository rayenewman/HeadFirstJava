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

        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        String name = console.readLine("Enter your name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String verb = console.readLine("Enter a verb: ");

        console.printf ("%s is very %s and %s very hard", name, adjective, verb);


        // TODO:  1. Create a new String named place and assign it a value of your choosing.

        String place = console.readLine("Select a place: ");

        // TODO:  2. Using the provided console object,
        //           prompt the user "What is your first name?" and store that in a variable

        String firstName = console.readLine("What is your first name?");

        // TODO:  3. Print out to the console "Hello <FIRST_NAME>!  Welcome to <PLACE>."

        console.printf ("Hello %s! Welcome to %s.", firstName, place);

        numberOfPeople = 5;

        int numberOfPeople = 3;

        if (numberOfPeople < 4) {
            console.printf("Your table is ready");
            System.exit(0);

        String ageAsString = console.readLine("How old are you? ");

        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            //Insert exit code
            console.printf("Sorry, you must be at least 13 to use this program.\n");
            System.exit(0);

            // I have imported a java.io.Console for you, it is named console.
            String firstExample = "hello";
            String secondExample = "hello";
            String thirdExample = "HELLO";

            if (firstExample.equals(secondExample)) {
                console.printf("first is equal to second");
            }


            }


            }

        }

    String ageAsString = console.readLine("How old are you? ");

    int age = Integer.parseInt(ageAsString);
    if (age < 13) {
        //Insert exit code
        console.printf("Sorry, you must be at least 13 to use this program.\n");
        System.exit(0);
    }


    String name = console.readLine("Enter your name: ");
    String adjective = console.readLine("Enter an adjective: ");
    String noun;
    boolean isInvalidWord;

      do {
        noun = console.readLine("Enter a noun: ");
        isInvalidWord = (noun.equalsIgnoreCase("dork") ||
                noun.equalsIgnoreCase("jerk"));
        if (isInvalidWord) ;
        {
            console.printf("That language is not allowed. Try again. \n\n");
        }
    } while (isInvalidWord);
    String verb = console.readLine("Enter a verb: ");
    String adverb = console.readLine("Enter a verb ending in -ing: ");


    console.printf ("%s is very %s and %s very hard\n", name, adjective, verb);
    console.printf ("Your TreeStory:\n-------------\n");
    console.printf("They are always %s %s.\n", adverb, verb);

    /* Now continually prompt the user in a do while loop.
    The loop should continue running as long as the response is No.
    Don't forget to declare response outside of the do while loop.
     */
    String response = "";
    do {
        response = console.readLine("Do you understand while loops?");
    }
    while (response == "No");

    console.printf("Because you said %s, you passed the test!", response);




}

}
