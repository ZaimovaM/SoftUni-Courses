import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double sumElectricity = 0;
        double otherBillFromMonth = 0;
        double sumOther = 0;
        double average = 0;


        for (int month = 1; month <= months; month++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            sumElectricity += electricityBill;
            otherBillFromMonth = (electricityBill + 20 + 15) + 0.20 * (electricityBill + 20 + 15);
            sumOther += otherBillFromMonth;

            average = (sumElectricity + (20 * months) + (15 * months) + sumOther ) / months;
        }
        double waterBill = 20 * months;
        double internetBill = 15 * months;
        System.out.printf("Electricity: %.2f lv%n", sumElectricity);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", sumOther);
        System.out.printf("Average: %.2f lv", average);

    }
}
