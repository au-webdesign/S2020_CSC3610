public class Dealer_1_17 {
        private Card_1_17[]  deck;
        private int topDeck;
        public Dealer_1_17() {
                 this.deck = createDeck();
                 this.topDeck = 0;
                 this.showMeTheDeck();
        }
        private void showMeTheDeck() {
                for( Card_1_17  c : deck ) {
                        System.out.printf("\n --- C:%s Suit:%s val:%s", c.getShowValue(),
                                c.getSuit(), c.getValue() );
                }

        }

        private Card_1_17[] createDeck() {
                Card_1_17[]  deck = new Card_1_17[52];
                String[] suits = { "Hearts", "Spades", "Clubs", "Diamonds"};
                int ctr = 0;
                for( String suit : suits ) {
                        for ( int i=0; i<13; i++ ) {
                                //val, suit
                                Card_1_17 c = new Card_1_17(i, suit);
                                deck[ctr++] = c;
                        }
                }
                return deck;
       }
}
