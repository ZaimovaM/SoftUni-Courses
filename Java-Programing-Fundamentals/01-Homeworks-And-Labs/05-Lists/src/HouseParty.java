import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGuests = Integer.parseInt(scanner.nextLine());

        List<String> guest = new ArrayList<>();

        for (int i = 1; i <= countGuests; i++) {
            String command = scanner.nextLine();
            String[] typeCommand = command.split(" ");
            String name = typeCommand[0];
            if (typeCommand[2].equals("going!")) {
                boolean isContain = guest.contains(name);
                if (isContain){
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                } else {
                    guest.add(name);
                }
            } else if (typeCommand[2].equals("not")){
               boolean isContain = guest.contains(name);
               if (isContain){
                   guest.remove(name);
               } else {
                   System.out.printf("%s is not in the list!", name);
                   System.out.println();
               }
            }
        }
        for (String name: guest) {
            System.out.println(name);
        }


    }
}
