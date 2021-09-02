import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int originalN = N;
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int countTargets = 0;

        while (M <= N) {
            N -= M;
            countTargets++;

            if (N == 0.5 * originalN) {
                if (Y != 0) {
                    N /= Y;
                }
            }

        }
        System.out.println(N);
        System.out.println(countTargets);
    }
}
