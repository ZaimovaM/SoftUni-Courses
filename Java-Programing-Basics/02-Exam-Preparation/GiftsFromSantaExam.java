import java.util.Scanner;

public class GiftsFromSantaExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int S = Integer.parseInt(scanner.nextLine());

        for (int i = M; i >= N; i--) {
            if (i == S && S % 2 == 0 && S % 3 == 0) {
                break;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.printf("%d ", i);
            }




        }
    }
}


