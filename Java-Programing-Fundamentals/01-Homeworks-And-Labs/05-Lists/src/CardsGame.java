import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String winPlayer = "";

        int firstPlayerSum = 0;
        int secondPlayerSum = 0;
        for (int index = 0; index <= firstPlayer.size() - 1; index++) {


                int firstCardValue = firstPlayer.get(index);
                int secondCardValue = secondPlayer.get(index);
                if (firstCardValue > secondCardValue) {
                    secondPlayer.set(index, 0);
                    firstPlayer.add(firstPlayer.size(), secondCardValue);
                   

                } else if (secondCardValue > firstCardValue) {
                    firstPlayer.set(index, 0);
                    secondPlayer.add(secondPlayer.size(), firstCardValue);
                   
                } else {
                    secondPlayer.remove(index);
                    firstPlayer.remove(index);
                }

        }
        firstPlayer.removeAll(Arrays.asList(0));
        secondPlayer.removeAll(Arrays.asList(0));
        if (firstPlayer.size() == 0){
            for (int card:
                 secondPlayer) {
                
            }
        }
    }
}
