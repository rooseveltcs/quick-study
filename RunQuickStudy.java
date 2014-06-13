/**
* RunQuickStudy.java
* Assignment: Final Project
* Purpose: To use knowledge learned in class
*     and to expand knowledge about coding.
*
* @version 06/12/14
* @author Kaitlyn Jakubek
*/

import java.awt.*;
import java.util.*;
import java.io.*;

public class RunQuickStudy {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        intro(console);
        quiz(console);
    }
   
    /**
     * Introduces the user to QUICK STUDY and gives them
     *     a brief overview of the program if they have
     *     never used the program before and request it.
     *
     * Also asks the user if they would like to directly
     *     import their flashcards or if they would like
     *     to have a text file read to create the flashcards.
     */
    public static void intro(Scanner console) throws FileNotFoundException {
        // Scanner console = new Scanner(System.in);
        System.out.println( "QUICK STUDY" );
        System.out.print("Have you used this program before (Y/N)? ");
        String previousUser = console.next();
        if (previousUser.equals("N")) {
            newUserMessage();
        }
      
        System.out.println();
        System.out.print("Do you want to directly import the flashcards (Y/N)? ");
        String directImportAnswer = console.next();
        if (directImportAnswer.equals("Y")) {
            directImport(console);
        } else if (directImportAnswer.equals("N")) {
            System.out.print("Do you want to import a file with your words on it (Y/N)? ");
            String fileImportAnswer = console.next();
            if (fileImportAnswer.equals("Y")) {
                importFile();
            } else if (fileImportAnswer.equals("N")) {
                System.out.println();
                System.out.println("You must import a file or directly import your words to make flashcards.");
            } else {
                System.out.println();
                System.out.println("Your answer needs be either: ");
                System.out.println("\"Y\" for YES");
                    System.out.println( "      OR");
                System.out.println("\"N\" for NO");
                }
        } else {
            System.out.println();
            System.out.println("Your answer needs be either: ");
            System.out.println("\"Y\" for YES");
               System.out.println("      OR");
            System.out.println("\"N\" for NO");
            }
      
    }
   
    /**
     * Imports the flashcards directly. Will ask the user
    *     what is on either side of the flashcard and if
     *     they would like to add another one to the set.
    */
    public static void directImport(Scanner userInput) {
        //       System.out.print("accessed directImport");
        System.out.print( "Flashcards set name? ");
        String nameOfSet = userInput.next();
      
      
        Set setOfCards = new Set(nameOfSet);
        String addMore = "Y" ;
        while (addMore.equals("Y" )) {
            System.out.print("What is on side A of the flashcard? ");
            String question = userInput.next();
            System.out.print("What is on side B of the flashcard? ");
            String answer = userInput.next();
            Card n = new Card(question, answer);
            setOfCards.add(n);
            System.out.print("Add another flashcard (Y/N)? ");
            addMore = userInput.next();
        }
     
        System.out.println();
        System.out.println(nameOfSet + ":" );
        System.out.println(setOfCards.toString());
    }
  
    /**
     * Imports a file containing all the flashcards.
     *     The file will be scanned and words will be
     *     placed on the proper sides of each flashcard.
     */
    public static void importFile() throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
      
        System.out.print("Input file name? " );
        String file = userInput.next();
        Scanner scanInputFile = new Scanner(new File(file));
      
        String nameOfSet = scanInputFile.nextLine();
       Set setOfCards = new Set(nameOfSet);
        while (scanInputFile.hasNextLine()) {
            String question = scanInputFile.next();
            String answer = scanInputFile.next();
            Card n = new Card(question, answer);
            setOfCards.add(n);
       }
      
        System.out.println();
        System.out.println(nameOfSet + ":" );
        System.out.println(setOfCards.toString());
      
    }
   
    /**
     * Asks the user if they are ready to begin
     *     a test on all the flashcards.
     */
    public static void quiz(Scanner userInput) {
        System.out.println();
        System.out.print("Are you ready to begin a test (Y/N)? ");
        String beginTest = userInput.next();
    }

    /**
     * Prints a message explaining what QUICK STUDY is
     *     and how to import one's flashcards.
     */
    public static void newUserMessage() {
        System.out.println();
        System.out.println("This program will create flashcards and help you study.");
        System.out.println("Flashcards have two sides. Side A generally holds a question");
        System.out.println("    while side B holds the answer. Side A and B can also");
        System.out.println("    hold simple relationships where the quiz can be reversed");
        System.out.println("    such as a country and its capital. In this case you could");
        System.out.println("    give the country and ask for its capital or you could give");
        System.out.println("    the capital and ask for the country it is located in.");
                System.out.println();
            System.out.println("First you must import your flashcards:");
            System.out.println("    You will have the option to directly import your flashcards");
            System.out.println("    by typing out the words on each side of the card. You can");
            System.out.println("    also choose to import a file which will be read and create");
            System.out.println("    flashcards from the file.");
    }
}