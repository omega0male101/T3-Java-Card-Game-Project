package example.codeclan.com.cardgame.enums;

/**
 * Created by user on 01/05/2017.
 */

public class Card {
    CardValues value;
    CardSuits suit;


    public Card(CardValues cvalue, CardSuits csuit) {
        this.value = cvalue;
        this.suit = csuit;

    }

    public int getValue() {
        int value = suit.ordinal() + 2;
        if (value > 10 && value < 14) value = 10;
        if (value == 14) value = 11;
        return value;
    }

    public String getName() {
        return value + " of " + suit;
    }
}