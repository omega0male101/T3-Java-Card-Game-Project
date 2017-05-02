package example.codeclan.com.cardgame.enums;

/**
 * Created by user on 01/05/2017.
 */

public class Player {

    String name;
    public CardDeal cards;
    public int points;

    public Player(String name, CardDeal hand) {
        this.name = name;
        this.cards = hand;
        this.points = 0;
    }

    public String getName() {
        return this.name;
    }


    public int totalPoints() {
        for (int i = 0; i < cards.countCards(); i++) {
            points = points + cards.cards.get(i).value;
        }
        return score;
    }
}