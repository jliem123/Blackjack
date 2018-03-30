import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    private ArrayList<Card> deck;
    Random rand = new Random();
    
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        deck = new ArrayList<Card>();
        initializeDeck();
    }
   
    public void initializeDeck() {
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String s: suits) {
            int value = 1;
            for (String r: ranks) {
                Card temp = new Card(value, s, r);
                value++;
                deck.add(temp);
            }
        }
    }
    
    public void shuffle()
    { 
        int[] shuffleDeck = new int[52]; 
        for (int i = 0; i < shuffleDeck.length; i++) {
            shuffleDeck[i] = i;
        }
        for (int i = 0; i < shuffleDeck.length; i++) {
            //int j = (int)(n * shuffleDeck.length); // Get a random index out of 52
            int  n = rand.nextInt(52);
            Card temp = deck.get(i); // Swap the cards
            deck.set(i,deck.get(n));
            deck.set(n, temp);
        }
    }
    
    public Card deal() {
        return (deck.get(0));
    }
    
    public void printDeck() {
        for(Card c : deck) {
            System.out.println(c);
        }
    }
}
