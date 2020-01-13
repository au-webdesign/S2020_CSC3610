public class sbVsString_1_13 {
    public static void main(String[] args) {
       long start1 = System.currentTimeMillis();
       int nTimes = 1000000;
       doItWithString( nTimes );
       long end1 = System.currentTimeMillis();
       System.out.printf("Total Millesecond for String %s append is %s", nTimes, (end1-start1));
       // Lets repeats this with StringBuffer
       long start2 = System.currentTimeMillis();
        doItWithStringBuffer( nTimes );
       long end2 = System.currentTimeMillis();
        System.out.printf("Total MS for StringBuffer %s append is %s", nTimes, (end2-start2));
    }

    private static void doItWithStringBuffer(int nTimes) {
        StringBuilder  sb = new StringBuilder( " " );
        for( int i=0; i<nTimes; i++  ) {
            //myS = myS + "X";
            sb.append("X");
        }
    }

    private static void doItWithString(int nTimes) {
        String myS = "";
        for( int i=0; i<nTimes; i++  ) {
            myS = myS + "X";
        }
    }
}
