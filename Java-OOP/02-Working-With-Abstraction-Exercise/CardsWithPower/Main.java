package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(cardSuit, cardRanks);
        System.out.printf("Card name: %s of %s; Card power: %d", cardRanks, cardSuit, card.getPower());
    }
}
