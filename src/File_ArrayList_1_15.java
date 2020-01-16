import java.util.ArrayList;
import java.util.Scanner;

public class File_ArrayList_1_15 {
    private String fileN;
    File_ArrayList_1_15( String f ) {
        this.fileN = f;
    }
    public ArrayList<String> getFile(){
        ArrayList<String> rList = new ArrayList<String>();
        try{
            java.io.File file = new java.io.File( fileN );
            Scanner input = new Scanner(file);
            while( input.hasNext()){
                String s = input.next();
                rList.add( s );
            }
           input.close();
        } catch( Exception ioe ){
            System.out.printf("\n Error on open of file:%s", this.fileN);
            System.exit(1);
        }
        return rList;
    }
}
