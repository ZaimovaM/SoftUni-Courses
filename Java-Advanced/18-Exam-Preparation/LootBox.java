import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        Deque<Integer> queueFirstBox = new ArrayDeque<>();
        Arrays.stream(firstLine).mapToInt(Integer::parseInt).forEach(queueFirstBox::offer);

        String[] secondLine = scanner.nextLine().split("\\s+");
        Deque<Integer> stackSecondBox = new ArrayDeque<>();
        Arrays.stream(secondLine).mapToInt(Integer::parseInt).forEach(stackSecondBox::push);

        int sumOfAllElements = 0;
        while (!queueFirstBox.isEmpty() && !stackSecondBox.isEmpty()) {
            int firstElement = queueFirstBox.peek();
            int secondElement = stackSecondBox.peek();
            int sumOfElements = firstElement + secondElement ;

                if (sumOfElements % 2 == 0) {
                    queueFirstBox.poll();
                    sumOfAllElements += sumOfElements;
                } else {
                    queueFirstBox.offer(secondElement);
                }
                stackSecondBox.pop();
            }


        String output = queueFirstBox.isEmpty() ? "First lootbox is empty" : "Second lootbox is empty";
        System.out.println(output);

        String output2 = sumOfAllElements >= 100 ? "Your loot was epic! Value: " : "Your loot was poor... Value: ";
        System.out.println(output2 + sumOfAllElements);
    }
}
