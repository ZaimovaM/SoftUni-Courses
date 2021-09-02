import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] typeCommand = command.split(" ");
            if (typeCommand[0].equals("Contains")) {
                int number = Integer.parseInt(typeCommand[1]);
                boolean isContain = printContainsNumber(number, numbers);
                if (isContain) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (typeCommand[0].equals("Print")) {
                if (typeCommand[1].equals("even")) {
                    printEvenNumber(numbers);

                } else if (typeCommand[1].equals("odd")) {
                    printOddNumber(numbers);
                }


            } else if (typeCommand[0].equals("Get")) {
                printSum(numbers);

            } else if (typeCommand[0].equals("Filter")) {
                String condition = typeCommand[1];
                int number = Integer.parseInt(typeCommand[2]);

                if (condition.equals(">")) {
                    printConditionBigger(number, numbers);

                } else if (condition.equals("<")) {
                    printConditionSmaller(number, numbers);

                } else if (condition.equals(">=")) {
                    printConditionBiggerOrEqual(number, numbers);
                } else if (condition.equals("<=")) {
                    printConditionSmallerOrEqual(number, numbers);
                }

            }


            command = scanner.nextLine();
        }
    }

    private static void printConditionSmallerOrEqual(int number, List<Integer> myList) {
        for (Integer integer : myList) {
            if (integer <= number) {
                System.out.print(integer + " ");

            }
        }
        System.out.println();
    }

    private static void printConditionBiggerOrEqual(int number, List<Integer> myList) {
        for (Integer integer : myList) {
            if (integer >= number) {
                System.out.print(integer + " ");

            }
        }
        System.out.println();
    }

    private static void printConditionSmaller(int number, List<Integer> myList) {
        for (Integer integer : myList) {
            if (integer < number) {
                System.out.print(integer + " ");

            }
        }

    }

    private static void printConditionBigger(int number, List<Integer> myList) {
        for (Integer integer : myList) {
            if (integer > number) {
                System.out.print(integer + " ");

            }
        }

    }

    private static void printSum(List<Integer> myList) {
        int sum = 0;
        for (int number : myList) {
            sum += number;
        }
        System.out.println(sum);


    }

    private static void printOddNumber(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 1) {
                System.out.print(myList.get(i) + " ");

            }
        }
        System.out.println();
    }

    private static void printEvenNumber(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.print(myList.get(i) + " ");

            }
        }
        System.out.println();
    }

    private static boolean printContainsNumber(int number, List<Integer> myList) {

        return myList.contains(number);

    }
}
