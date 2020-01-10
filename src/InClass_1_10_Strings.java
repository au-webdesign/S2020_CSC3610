import java.util.Scanner;

public class InClass_1_10_Strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Boolean keepGoing = true;
        while( keepGoing ) {
            System.out.print("\nWhat is your input String-> (STOP or ST to stop)");
            String theString = s.nextLine();
            if ( theString.equalsIgnoreCase("STOP") || theString.equalsIgnoreCase("ST") ) {
                System.out.print("\nOK Will stop");
                keepGoing = false;
            }  else {
                String theString2 = theString.replace("X", "Apple");
               System.out.printf("\ntheString now:%s", theString2 );
            }
            if(theString.contains("Pie")) {
                System.out.printf("\nYes theString has Plus:%s", theString );
            } else {
                System.out.printf("\nNo plus for you " );
            }
            if ( gotThisChar( theString, 'z')) {
                System.out.printf("\n------ YestheString has z:%s", theString );
            } else {
                System.out.printf("\n..... No  z in string:%s", theString );
            }
        }
    }
    private static boolean gotThisChar(String theString, char inC ) {
        Boolean retVal = false;
        for ( int i=0; i<theString.length(); i++ ) {
            char c = theString.charAt(i);
            if ( c == inC ) {
                return true;
            }
        }
        return retVal;
    }
}
