package example.codeclan.com.cardgame.enums;

/**
 * Created by user on 01/05/2017.
 */

public class Dealer{

    public CardDeal deck;

    public Dealer(CardDeal deck){
        this.deck = deck;
    }

    public void dealPlayer(Player player){
        Card card = deck.removeCard();
        player.cardsHeld.addCard(card);
    }
}