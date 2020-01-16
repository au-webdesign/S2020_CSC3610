import java.util.ArrayList;

public class DriveTeams_1_15 {
    public static void main(String[] args) {
       ArrayList<Team_1_13> teams = getTeams();
       String tName = "Saints";
       outputTeams( teams, tName );
    }

    private static void outputTeams(ArrayList<Team_1_13> teams, String tName ) {
        System.out.printf("\n---- Starting output ----- ");
        for( Team_1_13 team :  teams ){
            if ( tName.equalsIgnoreCase( team.getName())) {
                System.out.print( "\n" + team.toString() );
            }
        }
    }

    private static ArrayList<Team_1_13> getTeams() {
        ArrayList<Team_1_13> t = new ArrayList<>();
        //String name, int wins, int loss, String conf)
       Team_1_13 bears = new Team_1_13("Bears", 8, 8, "North");
       bears.conf = "Left Out";
        //System.out.printf("Name:" +bears.name );

       t.add( bears );
       t.add( new Team_1_13("Lions", 8, 8, "North") );
       t.add( new Team_1_13("Packers", 10, 6, "North") );
       t.add( new Team_1_13("49ers", 11, 5, "West") );
       t.add( new Team_1_13("Saints", 11, 5, "South") );
       t.add( new Team_1_13("Ravens", 14, 2, "East") );
       return t;
    }
}
