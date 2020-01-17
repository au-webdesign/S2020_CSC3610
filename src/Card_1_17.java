public class Card_1_17 {
    private int value;  // Ecncapsulate to protect my data
    private String showValue;
    private String suit;
    // 0 -> 2 , 1 ->3, 2 -> 4
    // 8-10, 9->J, 10->Q, 11->K 12->A
    Card_1_17( int val, String suit){
        this.value = val;
        this.suit = suit;
        if ( val >=0 && val <= 8 ){
           this.showValue = Integer.toString( (val+2) );
        } else if ( val == 9 ){
            this.showValue = "J";
        } else if ( val == 10 ){
            this.showValue = "Q";
        } else if ( val == 11 ){
            this.showValue = "K";
        } else if ( val == 12 ) {
            this.showValue = "A";
        }else {
            // Defensive programming
            System.out.printf("\nError Illegal Card val:%s", val );
            System.exit(1);
        }
    }
    public int getValue() {
        return value;
    }
    public String getShowValue() {
        return showValue;
    }
    public String getSuit() {
        return suit;
    }
}
