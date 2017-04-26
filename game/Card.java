public class Card {
    int value;
    CardSuit suit;


    public Card(int cvalue, Cardsuit csuit) {
        this.value = cvalue;
        this.suit = csuit;

    }

    public int getValue(){
        return this.value;
    }

    public CardSuit getSuit() {
        return this.suit;
    }
}