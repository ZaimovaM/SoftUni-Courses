import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];
        readMatrix(matrix, scanner);


        int sumPrimaryDiagonal = getSumPrimaryDiagonal(matrix);
        int sumSecondaryDiagonal = getSumSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));

    }

    private static int getSumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == matrix.length - row - 1){
                    sum += matrix[row][col];
                }
            }

        }
        return sum;
    }

    private static int getSumPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    sum += matrix[row][col];
                }
            }

        }
        return sum;
    }



    private static void readMatrix(int [][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {

            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
    }
}
