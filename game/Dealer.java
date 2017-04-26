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