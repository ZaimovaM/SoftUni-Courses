import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int countIteration = 0;
        int countSuccessLoaded = 0;

        while (!command.equals("End")){
            double volumeBag = Double.parseDouble(command);
            countIteration++;
            if (countIteration == 3) {
                volumeBag = volumeBag + (volumeBag * 0.10);
                capacity -= volumeBag;
                countIteration = 0;
            } else {
                capacity -= volumeBag;
            }

            if (capacity <= 0){
                System.out.println("No more space!");
                break;
            } else {
                countSuccessLoaded++;
            }


            command = scanner.nextLine();
            if (command.equals("End")){
                System.out.println("Congratulations! All suitcases are loaded!");
            }
        }
        System.out.printf("Statistic: %d suitcases loaded.", countSuccessLoaded);

    }
}
