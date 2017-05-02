public class Card {
    int value;
    CardSuits suit;


    public Card(int cvalue, Cardsuits csuit) {
        this.value = cvalue;
        this.suit = csuit;

    }

    public int getValue(){
        return this.value;
    }

    public CardSuits getSuit() {
        return this.suit;
    }
}