import java.util.ArrayList;
import java.util.Scanner;


/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private double amtMoney;
    private int handTotal;
    private ArrayList<Card> hand;
    private int valueAce;
    Scanner keyboard = new Scanner(System.in);
    private int sum; 
    
    /**
     * Constructor for objects of class Player
     */
    public Player(String nm, int amt)
    {
        // initialise instance variables
        this.name = nm;
        this.amtMoney = amt;
        hand = new ArrayList<Card>();
    }

    public void bet()
    {
        System.out.println("How much do you want to bet?");
        int amtMoney = keyboard.nextInt();
    }
    
    public void hit(Card c) {
        hand.add(c);
    }
    
    public void updateWinnings() {
        
    }
    
    public void ace() {
        for (int i = 0; i < hand.size(); i ++) {     
            if (hand.get(i).getRank() == "A") {
                System.out.println("Do you want your ace to be a 1 or an 11?");
                int aceValue = keyboard.nextInt();
                if (aceValue == 1) {
                    valueAce = 1;
                }
                else {
                    valueAce = 11;
                }
            }
        }
    }
    
    public int getHandTotal() {
        for (int i = 0; i < hand.size(); i++) {
            sum = 0;
            handTotal = sum + hand.get(i).getValue() ;  
        }
        return handTotal;
    }
    
    public String toString() {
        return "You have a " + hand.get(0) + " and a " + hand.get(1);
    }
}
