/**
* Card.java
* Assignment: Final Project
* Purpose: To use knowledge learned in class
*     and to expand knowledge about coding.
*
* @version 06/12/14
* @author Kaitlyn Jakubek
*/

public class Card implements Comparable<Card> {
    private String question;
    private String answer;
   
    public Card(String q, String a) {
        this .question = q;
        this .answer = a;
    }
   
    // Returns the question
    public String getQuestion() {
        return question;
    }
   
    // Returns the answer
    public String getAnswer() {
        return answer;
    }
   
    // Returns the Card as a String
    public String toString() {
        return "Question: " + question + ", Answer: " + answer + "\n";
    }
   
    // compares ONLY the question variable
    public int compareTo(Card card) {
        if (this .question != null && card.question != null){
            return this.question.compareToIgnoreCase(card.question);
        }
       
        return 0;
    }

}