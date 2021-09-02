import java.util.Scanner;

public class P02Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hartiq = Integer.parseInt(scanner.nextLine());
        int plat = Integer.parseInt(scanner.nextLine());
        double lepilo = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = (hartiq * 5.80) + (plat * 7.20) + (lepilo * 1.20);
        double totalSum = sum - (sum * discount / 100);
        System.out.printf("%.3f", totalSum);



    }
}
