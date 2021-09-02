import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double priceForGroup = 0;

        if (typeGroup.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                priceForGroup = countPeople * 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                priceForGroup = countPeople * 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                priceForGroup = countPeople * 10.46;
            }
            if (countPeople >= 30) {
                priceForGroup = priceForGroup - (priceForGroup * 0.15);
            }
        } else if (typeGroup.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                priceForGroup = countPeople * 10.90;
                if (countPeople >= 100){
                    priceForGroup = (countPeople - 10) * 10.90;
                }
            } else if (dayOfWeek.equals("Saturday")) {
                priceForGroup = countPeople * 15.60;
                if (countPeople >= 100){
                    priceForGroup = (countPeople - 10) * 15.60;
                }
            } else if (dayOfWeek.equals("Sunday")) {
                priceForGroup = countPeople * 16;
                if (countPeople >= 100){
                    priceForGroup = (countPeople - 10) * 16;
                }
            }

        } else if (typeGroup.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                priceForGroup = countPeople * 15;
            } else if (dayOfWeek.equals("Saturday")) {
                priceForGroup = countPeople * 20;
            } else if (dayOfWeek.equals("Sunday")) {
                priceForGroup = countPeople * 22.50;
            }
            if (countPeople >= 10 && countPeople <= 20){
                priceForGroup = priceForGroup - (priceForGroup * 0.05);
            }
        }
        System.out.printf("Total price: %.2f", priceForGroup);
    }
}
