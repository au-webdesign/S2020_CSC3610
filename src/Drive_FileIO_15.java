import java.util.ArrayList;

public class Drive_FileIO_15 {
    public static void main(String[] args) {
       File_ArrayList_1_15 fa = new File_ArrayList_1_15("sales.txt");
        ArrayList<String> lines = fa.getFile();
        for ( String line : lines ){
            System.out.printf("\nThis line:%s", line);
        }
    }
}
