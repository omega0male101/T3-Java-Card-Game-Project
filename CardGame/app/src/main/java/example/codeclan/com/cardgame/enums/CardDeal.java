package example.codeclan.com.cardgame.enums;

import java.util.ArrayList;

/**
 * Created by user on 01/05/2017.
 */

public class CardDeal{

    ArrayList<Card> cards;

    public CardDeal(){
        this.cards = new ArrayList<Card>();
    }

    public int countCards(){
        return this.cards.size();
    }
    public void addCard(Card card){
        this.cards.add(card);
    }

    public Card removeCard(){
        if (countCards() > 0){
            return cards.remove(0);
        }
        return null;
    }



}