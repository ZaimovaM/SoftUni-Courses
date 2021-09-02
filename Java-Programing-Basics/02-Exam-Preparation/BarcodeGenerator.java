import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int digit11 = num1 % 10;
        int ost1 = num1 / 10;
        int digit12 = ost1 % 10;
        int ost2 = ost1 / 10;
        int digit13 = ost2 % 10;
        int ost3 = ost2 / 10;
        int digit14 = ost3 % 10;

        int digit21 = num2 % 10;
        int ost12 = num2 / 10;
        int digit22 = ost12 % 10;
        int ost22 = ost12 / 10;
        int digit23 = ost22 % 10;
        int ost32 = ost22 / 10;
        int digit24 = ost32 % 10;


        for (int i = digit14; i <= digit24; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = digit13; j <= digit23; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = digit12; k <= digit22; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = digit11; l <= digit21; l++) {

                        if (l % 2 == 0) {
                            continue;
                        }
                        System.out.printf("%d%d%d%d ", i,j,k,l);
                    }
                }
            }


        }

    }
}
