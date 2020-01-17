import java.util.ArrayList;

public class Player_1_17 {
    private String  name;
    private double winnings;
    private ArrayList<Card_1_17> hand = new ArrayList<Card_1_17> ();
    public Player_1_17( String name, double winnings, ArrayList<Card_1_17> h){
        this.name = name;
        this.winnings = winnings;
        this.hand = h;
    }
    public String getName() { return name; }
    public double getWinnings() { return winnings; }
    public ArrayList<Card_1_17> getHand() { return hand; }
}
