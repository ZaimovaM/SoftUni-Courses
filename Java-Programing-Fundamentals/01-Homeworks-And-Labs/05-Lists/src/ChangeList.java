import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String [] typeCommand = command.split(" ");

            if (typeCommand[0].equals("Delete")){
                int element = Integer.parseInt(typeCommand[1]);
                myList.remove(Integer.valueOf(element));
                boolean isContain = myList.contains(element);
                while (isContain){

                    myList.remove(Integer.valueOf(element));
                    isContain = myList.contains(element);
                }

            } else if (typeCommand[0].equals("Insert")){
                int element = Integer.parseInt(typeCommand[1]);
                int index = Integer.parseInt(typeCommand[2]);
                myList.add(index, element);
            }



            command = scanner.nextLine();
        }
        for (int element: myList) {
            System.out.print(element + " ");
        }
    }
}
