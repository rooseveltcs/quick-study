/**
* Quiz.java
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

public class Quiz {
  Set allFlashcards;

    public Quiz(Set setOfCards) {
        this .allFlashcards = setOfCards;
    }
   
    /**
     * Asks the user which side of the card
     *     they want to be quized on.
     */
    public void startQuiz() {
        Scanner readInput = new Scanner(System.in);
     
        System.out.println("You can either be given side A and guess side B");
        System.out.println("OR you can choose to be given side B and guess side A.");
        System.out.println();
        System.out.print("Given side A and guess side B (Y/N)? ");
        String guessSideB = readInput.next();
        if (guessSideB.equals("Y" )) {
           askForAnswer(readInput);
        } else if (guessSideB.equals("N" )) {
            System.out.print("Given side B and guess side A (Y/N)? ");
            String guessSideA = readInput.next();
            if (guessSideA.equals("Y" )) {
                askForQuestion(readInput);
            } else if (guessSideA.equals("N" )) {
                System.out.println();
                System.out.println("You have not chosen a quiz to take.");
            } else {
               System.out.println();
                System.out.println("You have not chosen a quiz to take.");
                System.out.println("Your answers must be Y (yes) or N (no).");
           }
        } else {
            System.out.println();
            System.out.println("You have not chosen a quiz to take.");
            System.out.println("Your answers must be Y (yes) or N (no).");
        }
    }
   
    /**
     * If user wants to be quized on the answer
     *     and given the question, this will be
     *     the quiz used. It will check the user's
     *     input and tell the user if it is correct.
     */
    public void askForAnswer(Scanner readInput) {
        String continueQuiz = "Y" ;
        while (continueQuiz.equals("Y")) {
            allFlashcards.shuffleRandom();
            for (int i = 0; i < allFlashcards.size(); i++) {
                Card card = allFlashcards.get(i);
               String show = card.getQuestion();
                String answer = card.getAnswer();
                // supplies user with "show"
                System.out.print(show + ": ");
                // ask user for answer
                String guess = readInput.next();
                // check if answer and guess match
                if (guess.equals(answer)) {
                    // tell user if match or not
                    System.out.println( "    Correct!");
                } else { // if not, tell answer
                    System.out.println( "    The correct answer is " + answer);
                }
                // do again
            }
         
            System.out.print("Do you want to go through the flashcard set again (Y/N)? ");
            continueQuiz = readInput.next();
            System.out.println();
        }
         

    }
   
    /**
    * If user wants to be quized on the question
     *     and given the answer, this will be the
     *     quiz used. It will check the user's input
     *     and tell the user if it is correct.
     */
    public void askForQuestion(Scanner readInput) {
        String continueQuiz = "Y" ;
        while (continueQuiz.equals("Y")) {
            allFlashcards.shuffleRandom();
            for (int i = 0; i < allFlashcards.size(); i++) {
                Card card = allFlashcards.get(i);
               String show = card.getAnswer();
                String answer = card.getQuestion();
                // supplies user with "show"
                System.out.print(show + ": ");
                // ask user for answer
                String guess = readInput.next();
                // check if answer and guess match
                if (guess.equals(answer)) {
                    // tell user if match or not
                    System.out.println( "    Correct!");
                } else { // if not, tell answer
                    System.out.println( "    The correct answer is " + answer);
                }
                // do again
            }
         
            System.out.print("Do you want to go through the flashcard set again (Y/N)? ");
            continueQuiz = readInput.next();
        }
    }


}