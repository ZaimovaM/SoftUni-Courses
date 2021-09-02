import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Stop!")) {
            String[] splitInput = input.split("\\s+");
            String command = splitInput[0];
            if (command.equals("Join")) {
                String genre = splitInput[1];
                if (!isFound(genre, list)) {
                    list.add(genre);
                }

            } else if (command.equals("Drop")) {
                String genre = splitInput[1];
                if (isFound(genre, list)) {
                    list.remove(genre);
                }
            } else if (command.equals("Replace")) {
                String oldGenre = splitInput[1];
                String newGenre = splitInput[2];
                if (isFound(oldGenre, list) && !isFound(newGenre, list)) {
                    for (int i = 0; i <= list.size() - 1; i++) {
                        if (list.get(i).equals(oldGenre)){
                            list.remove(i);
                            list.add(i, newGenre);
                        }
                    }
                }
            }


            input = scanner.nextLine();
        }
        for (String genre: list) {
            System.out.print(genre + " ");
        }
    }

    private static boolean isFound(String genre, List<String> list) {
        return list.contains(genre);
    }
}
