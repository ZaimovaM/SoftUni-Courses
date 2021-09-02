import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] numbers = input.split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            String firstElement = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];

            }
            numbers[numbers.length - 1] = firstElement;

        }
        System.out.println(String.join(" ", numbers));

        }
    }

