import java.util.Scanner;

public class FileIO {
        private String fileN;
        private int MAX;
        FileIO(){
            MAX = 10;
            fileN = "Nothing";
        }
        public String getFileN() {
            return fileN;
        }
        public void setFileN(String fileN) {
            this.fileN = fileN;
        }
        public int getMAX() {
            return MAX;
        }
        public void setMAX(int mAX) {
            MAX = mAX;
        }
        public String[] getFile( )  {
            int ct=0;
            String[] retList = new String[MAX];
            try {
                //java.io.File file = new java.io.File("res1/scores.txt");
                java.io.File file = new java.io.File( fileN );
                // Create a Scanner for the file
                Scanner input = new Scanner(file);

                // Read data from a file

                while (input.hasNext()) {
                    if ( ct >= MAX ) {
                        System.out.print("WOAH! ... dont you think you had enough?");
                        break;
                    }
                    String inString = input.next();
                    retList[ct] = inString;
                    ct++;
                    // Close the file

                }
                input.close();
            } catch(Exception ioe ) {
                System.out.print( "\nProblems ... problems ... problems ... \nmsg= " + ioe.getMessage() );
                System.exit(1);
            }
            System.out.print( "got ct=" + ct + "Returning");
            return retList;
        }

    }
