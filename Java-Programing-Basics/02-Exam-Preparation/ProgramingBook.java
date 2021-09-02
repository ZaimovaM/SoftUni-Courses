import java.util.Scanner;

public class ProgramingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        double priceForDesigner = Double.parseDouble(scanner.nextLine());
        int percentAllSum = Integer.parseInt(scanner.nextLine());

        double startSum = pricePerPage * 899 + pricePerCover * 2;
        double sumDiscount = startSum - (startSum * percentDiscount / 100);
        double sumWithDesigner = sumDiscount + priceForDesigner;
        double finishSum = sumWithDesigner - (sumWithDesigner * percentAllSum / 100);
        System.out.printf("Avtonom should pay %.2f BGN.", finishSum);
    }
}
