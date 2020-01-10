import java.util.Scanner;

public class InClass_1_10b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Boolean keepGoing = true;
        while( keepGoing ) {
            System.out.print("\n Enter a date MM/DD/YYYY format");
            String theString = s.next();
            if( gotValidData( theString )){
               System.out.print("Yes that a valid date") ;
            } else {
                System.out.print("Nope! ... Not a valid date") ;
            }
        }
    }
    private static boolean gotValidData(String theString) {
        Boolean retVal = false;
        String toks[] = theString.split("/");
        if ( toks.length != 3 ){
            return false;
        }
        String mm = toks[0];
        if ( !gotValidMonth( mm )) {
            return false;
        }
        return true;
    }
    private static boolean gotValidMonth(String mm) {
        int nMon = Integer.parseInt( mm );
        if ( nMon >= 1 && nMon <= 12 ) {
            return true;
        }  else {
           return false;
        }
    }
}
