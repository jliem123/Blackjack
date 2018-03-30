import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private ArrayList<Player> players;
    private Deck deck = new Deck();
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    Card c = deck.deal();
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        players = new ArrayList<Player>();

        
        Player p = new Player("Joe", 100);
        Player d = new Dealer();
        players.add(p);
        players.add(d);
        
        play();
    }
    
    public void stay() {       
        players.get(1).hit(c);
        players.get(1).hit(c);
        if (players.get(1).getHandTotal() <= 17) {
            players.get(1).hit(c);            
        }
        System.out.println(players.get(1));
    }
   
    public void play() {
        //Deal two cards to player
        players.get(0).hit(c);
        players.get(0).hit(c);
        System.out.println(players.get(0));
        
        System.out.println("Do you want to bet or stay?");
        String betStay = reader.next();
        if (betStay == "bet" || betStay == "Bet") {
            players.get(0).bet();
        }
        else if (betStay == "stay" || betStay == "Stay") {
            stay();
        }
    }
}
