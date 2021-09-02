import java.util.Scanner;

public class TheSongOfTheWeels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());
        int countCombination = 0;

        boolean flag = false;
        String password = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i * j + k * l == M){
                            if (i < j && k > l) {
                                countCombination++;
                                System.out.printf("%d%d%d%d ", i, j, k, l);

                                if (countCombination == 4){
                                    flag = true;
                                    password = String.format("%d%d%d%d",i,j,k,l);
                                    //password = i + "" + j + "" + k + "" + l;
                                }

                            }
                        }
                    }

                }

            }


        }
        if (flag){
            System.out.println();
            System.out.printf("Password: %s", password);
        } else {
            System.out.println();
            System.out.println("No!");
        }

    }
}
