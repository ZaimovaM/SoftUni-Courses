import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> kids = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(kids::offer);
        int tosses = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        while (kids.size() > 1) {

            for (int i = 1; i < tosses; i++) {
                kids.offer(kids.poll());

            }
            counter++;
            if (!isPrime(counter)) {
                System.out.println("Removed " + kids.poll());
            } else {
                System.out.println("Prime " + kids.peek());
            }

        }
        System.out.println("Last is " + kids.peek());
    }

    private static boolean isPrime(int counter) {
        if (counter == 1){
            return false;
        }
        if (counter == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(counter); i++) {
                if (counter % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }
}
