import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int wonBattle = 0;
        int counBattle = 0;
        while (!command.equals("End of battle")){
            int distance = Integer.parseInt(command);
            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                wonBattle++;
                counBattle++;
                if (wonBattle == 3){
                  wonBattle = 0;
                  initialEnergy = initialEnergy + counBattle;
                }

            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", counBattle, initialEnergy);
                return;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",counBattle, initialEnergy);
    }
}
