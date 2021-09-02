import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetSequence = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int countShotTargets = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index <= targetSequence.size() - 1) {
                countShotTargets++;
                int value = targetSequence.get(index);
                targetSequence.set(index, -1);
                for (int element = 0; element < targetSequence.size(); element++) {
                    int elements = targetSequence.get(element);
                    if (elements == -1) {
                        continue;

                    } else if (elements > 0) {

                        if (targetSequence.get(element) > value) {
                            elements -= value;
                            targetSequence.set(element, elements);
                        } else {
                            elements += value;
                            targetSequence.set(element, elements);
                        }

                    }
                }

            }
            command = scanner.nextLine();

        }

        System.out.printf("Shot targets: %d -> ", countShotTargets);
        for (int targets : targetSequence) {
            System.out.print(targets + " ");
        }

    }


}
