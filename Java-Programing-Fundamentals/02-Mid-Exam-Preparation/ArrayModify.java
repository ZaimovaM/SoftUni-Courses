import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] splitInput = input.split("\\s+");
            String command = splitInput[0];
            if (command.equals("swap")){
                int index1 = Integer.parseInt(splitInput[1]);
                int index2 = Integer.parseInt(splitInput[2]);
                int firstNum = 0;
                int secondNum = 0;
                for (int i = 0; i <= numbers.size() - 1; i++) {
                    if (i == index1) {
                        firstNum = numbers.get(i);

                    } if (i == index2){
                        secondNum = numbers.get(i);
                    }
                }
                numbers.set(index1, secondNum);
                numbers.set(index2, firstNum);

            } else if (command.equals("multiply")){
                int index1 = Integer.parseInt(splitInput[1]);
                int index2 = Integer.parseInt(splitInput[2]);
                int firstNum = 0;
                int secondNum = 0;
                for (int i = 0; i <= numbers.size() - 1; i++) {
                    if (i == index1) {
                        firstNum = numbers.get(i);

                    } if (i == index2){
                        secondNum = numbers.get(i);
                    }
                }
                int multiply = firstNum * secondNum;
                numbers.set(index1, multiply);

            } else if (command.equals("decrease")){
                for (int i = 0; i <= numbers.size() -1; i++) {
                    int currentNum = numbers.get(i);
                    currentNum = currentNum - 1;
                    numbers.set(i, currentNum);
                }
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if(i == numbers.size() - 1){
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
    }
}
