/**
* Set.java
* Assignment: Final Project
* Purpose: To use knowledge learned in class
*     and to expand knowledge about coding.
*
* @version 06/12/14
* @author Kaitlyn Jakubek
*/

import java.util.*; // for scanner and ArrayList

public class Set {
    public String name;
    private ArrayList<Card> list;
 
    public Set(String name) {
        this .name = name;
        this .list = new ArrayList<Card>();
    }

    // Adds a Card at the end of this list.
    public void add(Card card) {
        list.add(card);
    }
  
    // Removes a given Card
    public void remove(Card card) {
        int index = list.indexOf(card);
        list.remove(index);
    }
 
    // Returns the number of items in this list.
    public int size() {
        return list.size();
    }
 
    // Returns the Card with the given index (0-based).
    public Card get(int index) {
        return list.get(index);
    }
 
    // Returns the name of this set.
    public String getName() {
        return name;
   }
 
    // Shuffles all the cards in the ArrayList
    public void shuffleRandom() {
        Collections.shuffle(list);
    }
 
    //Alphabetizes all the cards in the ArrayList
    public void alphabetize() {
        Collections.sort(list);
    }
 
    // Returns ArrayList as a string only within Set.
    private String string() {
        return list.toString();
    }
 
    // Returns ArrayList as a string outside Set.
    public String toString() {
       return string();
    }
   
}