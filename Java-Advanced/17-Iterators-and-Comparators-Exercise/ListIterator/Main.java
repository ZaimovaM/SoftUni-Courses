package ListIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ListIterator listIterator = null;

        while (!command.equals("END")){
            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];
            switch (commandName){
                case "Create":
                    if (commandParts.length > 1) {
                        listIterator = new ListIterator(Arrays.copyOfRange(commandParts, 1, commandParts.length));
                    } else {
                        listIterator = new ListIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listIterator.hasNext());
                    break;
                case "Print":
                  try{
                      listIterator.print();
                  } catch (IllegalStateException e ){
                      System.out.println(e.getMessage());
                  }
                    break;

            }


            command = scanner.nextLine();
        }
    }
}
