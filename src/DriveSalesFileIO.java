public class DriveSalesFileIO {
    public static void main(String[] args) {
            String myFile = "sales.txt";
            String[] inData;
            FileIO FIO =new FileIO();
            FIO.setFileN( myFile );
            FIO.setMAX( 10 );
            Double totalSales = 0.0;
            int ctr = 0;
            inData = FIO.getFile();
            System.out.printf("Indata length:%s", inData.length);
            for ( int i=0; i<inData.length; i++ ){
                    String toks[] = inData[i].split(",");
                    String rgn = toks[0];
                    String name = toks[1];
                    String item = toks[2];
                    int  ct  = Integer.parseInt( toks[3]);
                    double price   = Double.parseDouble( toks[4]);
                    System.out.printf(" \n Rgn:%s Nm:%s Item:%s ct:%s pr:%s", rgn, name, item, ct, price);
            }
    }

}

