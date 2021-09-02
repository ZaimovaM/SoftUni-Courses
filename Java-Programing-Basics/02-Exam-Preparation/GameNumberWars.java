import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstGamer = scanner.nextLine();
        String secondGamer = scanner.nextLine();
        int firstPoints = 0;
        int secondPoints = 0;
        boolean flag = true;

        String command = scanner.nextLine();

        while (!command.equals("End of game")){
            int firstCard = Integer.parseInt(command);
            int secondCard = Integer.parseInt(scanner.nextLine());
            if (firstCard > secondCard){
                firstPoints += firstCard - secondCard;
            }
            else if (firstCard < secondCard){
                secondPoints += secondCard - firstCard;
            }
           else {
                System.out.println("Number wars!");
                flag = false;
                int firstCardtwo = Integer.parseInt(scanner.nextLine());
                int secondCardtwo = Integer.parseInt(scanner.nextLine());
                if (firstCardtwo > secondCardtwo){
                    System.out.printf("%s is winner with %d points", firstGamer, (firstCardtwo - secondCardtwo));
                } else {
                    System.out.printf("%s is winner with %d points", secondGamer, (secondCardtwo - firstCardtwo));
                }
                break;
           }

            command = scanner.nextLine();
        }
      if (flag) {
          System.out.printf("%s has %d points%n", firstGamer, firstPoints);
          System.out.printf("%s has %d points", secondGamer, secondPoints);
      }
    }
}
