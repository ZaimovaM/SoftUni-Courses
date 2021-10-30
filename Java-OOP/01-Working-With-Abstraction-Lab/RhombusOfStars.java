import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printTop(n);
        printMiddle(n);
        printBottom(n);
    }

    public static void printTop(int n) {
        for (int row = 1; row < n; row++) {
            repeatAndPrintString(n - row, " ");
            repeatAndPrintString(row, "* ");

            System.out.println();
        }
    }

    public static void printMiddle(int n) {
        repeatAndPrintString(n, "* ");
        System.out.println();
    }

    public static void printBottom(int n) {
        for (int row = 1; row < n; row++) {
            repeatAndPrintString(row, " ");
            repeatAndPrintString(n - row, "* ");

            System.out.println();
        }
    }

    public static void repeatAndPrintString(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }





}
