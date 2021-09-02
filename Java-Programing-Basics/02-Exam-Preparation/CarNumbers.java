import java.util.Scanner;

public class CarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                for (int k = start; k <= finish; k++) {
                    for (int l = start; l <= finish; l++) {
                        if (i % 2 == 0 && l % 2 == 1 ||
                                i % 2 == 1 && l % 2 == 0) {
                            if (i > l) {
                                if ((j + k) % 2 == 0) {
                                    System.out.printf("%d%d%d%d ", i,j,k,l);
                                }
                            }
                        }


                    }

                }

            }

        }
    }
}
