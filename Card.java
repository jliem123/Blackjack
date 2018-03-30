
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private int value;
    private String suit;
    private String rank;
    
    /**
     * Constructor for objects of class Card
     */
    public Card(int val, String st, String rn)
    {
        this.suit = st;
        this.value = val;
        this.rank = rn;
    }
    
    public String getRank() {
        return this.rank;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getSuit() {
        return this.suit;
    }
    
    public String toString() {
            return this.rank + " of " + this.suit;
    }
}
