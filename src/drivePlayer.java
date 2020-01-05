import java.util.Random;
import java.util.Scanner;

public class drivePlayer {
    public static void main(String[] args) {
        String[] players = new String[2];
        double[] playersPurse = new double[2];
        int p1 = 0;
        int p2 = 1;
        players[p1] = "Jake";
        playersPurse[p1] = 100;

        players[p2] = "Jane";
        playersPurse[p2] = 100;

        double bet = 10;

        boolean keepGoing = true;
        while ( keepGoing ) {
           // p1 turn
            String p1Guess = getGuessfromPlayer( p1, players, playersPurse );
            String f1 = coinFlip();
            String msg = String.format( " Player:%s Player Flip:%s Computer Flip:%s ", players[p1], p1Guess, f1 );
            if ( p1Guess.equals(f1)) {
                playersPurse[p1] += bet;
                System.out.print( msg + "..... WINNER!!!!" + "Purse=" + playersPurse[p1] );
            } else {
                System.out.print( msg + "..... Loser!!!!" + "Purse=" + playersPurse[p1] );
                playersPurse[p1] -= bet;
            }

            System.out.print( "Playing again ...." );
        }
    }

    private static String getGuessfromPlayer(int p1, String[] players, double[] playersPurse) {
        boolean keepGoing = true;
        String g = "";
        while ( keepGoing ) {
            String msg = String.format("OK %s guess Heads(H) or Tails (T)", players[p1]);
            System.out.println( msg );
            Scanner s = new Scanner(System.in);
            g = s.next();
            if ( g.equals("T") || g.equals("H")) {
               break;
            } else {
                System.out.println( "Illegal input ... ");
            }
        }
        return g;
    }
    private static String coinFlip() {
        Random generator = new Random();
        int num1 = generator.nextInt(2) + 1;
        System.out.print( "num1=" + num1 );
        if ( num1 == 0 ) {
            return "H";
        } else {
            return "T";
        }
    }
}
