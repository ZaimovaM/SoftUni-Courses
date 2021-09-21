import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizeMatrix = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];
        int[][] matrix = new int[rows][cols];
        matrix = readMatrix(rows, cols, scanner);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(containsNumber(number, matrix));

    }

    private static String containsNumber(int number, int[][] matrix) {
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];
                if (currentNumber == number){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }

        }

        return isFound ? "" : "not found";

    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;

        }

        return matrix;

    }
}
