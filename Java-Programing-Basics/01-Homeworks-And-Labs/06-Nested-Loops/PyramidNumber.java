import java.util.Scanner;

public class PyramidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 0;
        for (int rows = 1; rows <= n; rows++) {
            for (int colons = 1; colons <= rows; colons++) {
                currentNum++;
                if (currentNum > n){
                    break;
                }
                System.out.printf("%d ", currentNum);;
            }
            if (currentNum > n){
                break;
            }
            System.out.println();
        }
    }
}
