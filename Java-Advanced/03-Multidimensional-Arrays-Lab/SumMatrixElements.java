import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(", ")[0]);
        int cols = Integer.parseInt(input.split(", ")[1]);

        int[][] matrix = readMatrix(rows, scanner);
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(getSumOfAllElements(matrix));
    }

    private static int getSumOfAllElements(int[][] matrix) {
        int sumOfAllElements = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumOfAllElements += matrix[row][col];
            }
        }
        return sumOfAllElements;
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = currentArr;
        }
        return matrix;
    }
}
