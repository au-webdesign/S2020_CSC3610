import java.util.ArrayList;
import java.util.Scanner;

public class FileIO_ArrayList {
        private String fileN;
        // This version reads the entire file into an array list
        // There is no 'MAX' number of lines

        // FileN is required
        FileIO_ArrayList( String fileN ){
            this.fileN = fileN;
        }
        public String getFileN() {
            return fileN;
        }
        public ArrayList<String> getFile( )  {
            int ct=0;
            ArrayList<String> retList = new ArrayList<String>();
            try {
                //java.io.File file = new java.io.File("res1/scores.txt");
                java.io.File file = new java.io.File( fileN );
                // Create a Scanner for the file
                Scanner input = new Scanner(file);

                // Read data from a file

                while (input.hasNext()) {
                    String inString = input.next();
                    retList.add( inString );
                    ct++;
                }
                // Close the file
                input.close();
            } catch(Exception ioe ) {
                System.out.print( "\nProblems ... problems ... problems ... \nmsg= " + ioe.getMessage() );
                System.exit(1);
            }
            System.out.print( "got ct=" + ct + "Returning");
            return retList;
        }
    }
