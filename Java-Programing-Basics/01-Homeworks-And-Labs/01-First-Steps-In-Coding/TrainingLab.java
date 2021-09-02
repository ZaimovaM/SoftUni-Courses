import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wMeter = Double.parseDouble(scanner.nextLine());
        double hMeter = Double.parseDouble(scanner.nextLine());

        double hCm = wMeter * 100;
        double wCm = hMeter * 100;
        double wCmBox = wCm - 100;
        int placesW = (int)wCmBox / 70;
        int placesH = (int)hCm / 120;
        double countPlaces = (placesW * placesH) - 3;
        System.out.printf("%.0f", countPlaces);
    }
}
