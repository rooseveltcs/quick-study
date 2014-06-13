/**
* Test.java
* Assignment: Final Project
* Purpose: To use knowledge learned in class
*     and to expand knowledge about coding.
*
* @version 06/12/14
* @author Kaitlyn Jakubek
*/

public class Test {
    public static void main(String[] args) {
//         testBasicConstructor();
//         testSetOfCards();
//         testShuffleRandom();
//         testRemove();
//         testAlphabetize();
        testQuiz();
   }
   
    /**
     * Test that the Card class holds the
     *     question and answer correctly.    
     */
    public static void testBasicConstructor() {
        System.out.println("Verify this prints: \n\"Question: Some question, Answer: Some answer\"");
        Card a = new Card("Some question" , "Some answer");
        System.out.print(a.toString());
    }
   
    /**
     * Tests that the Set class holds the
     *     individual cards correctly.
     */
    public static void testSetOfCards() {
        System.out.println("Verify this prints: \n\"Question:");
       
        Card a = new Card("Q1" , "A1" );
        Card b = new Card("Q2" , "A2" );
        Card c = new Card("Q3" , "A3" );
       
        Set test = new Set("Test" );
        test.add(a);
        test.add(b);
        test.add(c);
        System.out.println(test.toString());
    }
    /**
     * Test that the Set will be shuffled randomly
     */
    public static void testShuffleRandom() {
        Card a = new Card("Q1" , "A1" );
        Card b = new Card("Q2" , "A2" );
        Card c = new Card("Q3" , "A3" );
        Card d = new Card("Q4" , "A4" );
        Card e = new Card("Q5" , "A5" );
       
        Set test = new Set("Test" );
        test.add(a);
        test.add(b);
        test.add(c);
        test.add(d);
        test.add(e);
        System.out.println("Test 1:" );
        System.out.println(test.toString());
       
        System.out.println("Test 2:" );
        test.shuffleRandom();
        System.out.println(test.toString());
       
        System.out.println("Test 3:" );
        test.shuffleRandom();
        System.out.println(test.toString());
    }
   
    /**
     * Tests that the Card in a Set can be removed
     *     without affecting the other cards.
     */
    public static void testRemove() {
        Card a = new Card("Q1" , "A1" );
        Card b = new Card("Q2" , "A2" );
        Card c = new Card("Q3" , "A3" );
        Card d = new Card("Q4" , "A4" );
        Card e = new Card("Q5" , "A5" );
       
        Set test = new Set("Test" );
       test.add(a);
        test.add(b);
        test.add(c);
        test.add(d);
        test.add(e);
        System.out.println("Test 1:" );
        System.out.println(test.toString());
       
        System.out.println("Test 2:" );
        test.remove(c);
        System.out.println(test.toString());
    }
  
    /**
     * Test that the set of cards is properly
     *     alphabetized from A to Z.
     */
    public static void testAlphabetize() {
        Card one = new Card("charlie" , "C" );
        Card two = new Card("Echo" , "E" );
       Card three = new Card("Alpha" , "A" );
        Card four = new Card("delta" , "D" );
        Card five = new Card("bravo" , "B" );
       
        Set test = new Set("Test" );
        test.add(one);
        test.add(two);
        test.add(three);
        test.add(four);
        test.add(five);
        System.out.println("Test 1:" );
        System.out.println(test.toString());
       
        System.out.println("Test 2:" );
        test.alphabetize();
        System.out.println(test.toString());
       
        System.out.println("Test 3:" );
        test.shuffleRandom();
        System.out.println(test.toString());
       
        System.out.println("Test 4:" );
        test.alphabetize();
       System.out.println(test.toString());
    }
   
    /**
     * Tests that the Quiz class works properly
     */
    public static void testQuiz() {
  
        Card a = new Card("alpha" , "A" );
        Card b = new Card("bravo" , "B" );
        Card c = new Card("charlie" , "C" );
        Card d = new Card("delta" , "D" );
        Card e = new Card("echo" , "E" );
       
        Set testSet = new Set("Test" );
        testSet.add(a);
        testSet.add(b);
        testSet.add(c);
        testSet.add(d);
        testSet.add(e);
       
        Quiz testQuiz = new Quiz(testSet);
        testQuiz.startQuiz();
    }
}