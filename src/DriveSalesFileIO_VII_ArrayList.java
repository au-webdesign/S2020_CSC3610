import java.util.ArrayList;

public class DriveSalesFileIO_VII_ArrayList {
    public static void main(String[] args) {
            String myFile = "sales.txt";
            ArrayList<String> inData = new ArrayList<>();
            inData = getInputFileData( myFile );
            showData( inData );

    }
    private static void showData( ArrayList<String> inData) {
            int ctr = 0;
            System.out.printf("Indata length:%s", inData.size());
            for ( String line : inData ){
                String toks[] = line.split(",");
                String rgn = toks[0];
                String name = toks[1];
                String item = toks[2];
                int  ct  = Integer.parseInt( toks[3]);
                double price   = Double.parseDouble( toks[4]);
                System.out.printf(" \n Rgn:%s Nm:%s Item:%s ct:%s pr:%s", rgn, name, item, ct, price);
            }
        }
    private static ArrayList<String> getInputFileData(String myFile) {
                ArrayList<String> retData = new ArrayList<>();
                FileIO_ArrayList FIO =new FileIO_ArrayList(myFile);
                retData = FIO.getFile();
                return retData;
        }
}

