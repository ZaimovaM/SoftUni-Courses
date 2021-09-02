import java.util.*;
import java.util.stream.Collectors;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> deck = Arrays.stream(scanner.nextLine().split("\\:")).collect(Collectors.toList());
        List<String> cards = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("Ready")) {
            String[] splitInput = input.split("\\s+");
            String command = splitInput[0];
            if (command.equals("Add")) {
                String cardName = splitInput[1];
                if (isFound(cardName, deck)) {
                    cards.add(cardName);
                } else {
                    System.out.println("Card not found.");
                }
            } else if (command.equals("Insert")) {
                String cardName = splitInput[1];
                int index = Integer.parseInt(splitInput[2]);
                if (isFound(cardName, deck) && validIndex(index, cards)) {
                    cards.add(index, cardName);
                } else {
                    System.out.println("Error!");
                }

            } else if (command.equals("Remove")) {
                String cardName = splitInput[1];
                if (isFound(cardName, cards)) {
                    cards.remove(cardName);
                } else {
                    System.out.println("Card not found.");
                }

            } else if (command.equals("Swap")) {
                String cardName1 = splitInput[1];
                String cardName2 = splitInput[2];
                String firstCard = "";
                String secondCard = "";
                int index1 = 0;
                int index2 = 0;
                for (int i = 0; i <= cards.size() - 1; i++) {
                    if (cards.get(i).equals(cardName1)) {
                        firstCard = cards.get(i);
                        index1 = i;

                    }

                    if (cards.get(i).equals(cardName2)) {
                        secondCard = cards.get(i);
                        index2 = i;
                    }
                }
                cards.remove(cardName1);
                cards.remove(cardName2);
                cards.add(index1, secondCard);
                cards.add(index2, firstCard);



            } else if (command.equals("Shuffle")) {
                Collections.reverse(cards);
            }


            input = scanner.nextLine();
        }
        for (String card : cards) {
            System.out.print(card + " ");
        }

    }

    private static boolean validIndex(int index, List<String> cards) {
        return index >= 0 && index <= cards.size() - 1;
    }

    private static boolean isFound(String cardName, List<String> deck) {
        return deck.contains(cardName);
    }
}
