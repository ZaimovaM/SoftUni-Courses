package CardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardRanks cardRanks;

    public Card(CardSuit cardSuit, CardRanks cardRanks) {
        this.cardSuit = cardSuit;
        this.cardRanks = cardRanks;
    }

    public int getPower(){
        return cardRanks.getRankPower() + cardSuit.getSuitPower();
    }
}
