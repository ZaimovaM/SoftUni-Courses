
import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rowsFirstMatrix = Integer.parseInt(input.split("\\s+")[0]);
        int colsFirstMatrix = Integer.parseInt(input.split("\\s+")[1]);

        int[][] firstMatrix = readMatrix(rowsFirstMatrix, scanner);


        input = scanner.nextLine();
        int rowsSecondMatrix = Integer.parseInt(input.split("\\s+")[0]);
        int colsSecondMatrix = Integer.parseInt(input.split("\\s+")[1]);

        int[][] secondMatrix = readMatrix(rowsSecondMatrix, scanner);


        String output = compareMatrix(rowsFirstMatrix, rowsSecondMatrix, colsFirstMatrix, colsSecondMatrix, firstMatrix, secondMatrix) ? "equal" : "not equal";
        System.out.println(output);


    }

    private static boolean compareMatrix(int rows1, int rows2, int cols1, int cols2, int[][] firstMatrix, int[][] secondMatrix) {
        if (rows1 != rows2 || cols1 != cols2) {
            return false;
        }
        for (int row = 0; row < rows1; row++) {
            for (int col = 0; col < cols1; col++) {

                int currentElementFirst = firstMatrix[row][col];
                int currentElementSecond = secondMatrix[row][col];
                if (currentElementFirst != currentElementSecond) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = currentArr;
        }
        return matrix;
    }
}
