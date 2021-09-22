import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matrixSize = scanner.nextLine();
        int rows = Integer.parseInt(matrixSize.split("\\s+")[0]);
        int cols = Integer.parseInt(matrixSize.split("\\s+")[1]);
        int[][] matrix = readMatrix(rows, scanner);
        int maxSum = 0;

        int[][] maxMatrix = new int[3][3];
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] + matrix[row + 1][col]
                        + matrix[row + 1][col + 2] + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2]
                        + matrix[row + 1][col + 1];

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    maxMatrix[0][0] = matrix[row][col];
                    maxMatrix[0][1] = matrix[row][col + 1];
                    maxMatrix[0][2] = matrix[row][col + 2];
                    maxMatrix[1][0] = matrix[row + 1][col];
                    maxMatrix[1][1] = matrix[row + 1][col + 1];
                    maxMatrix[1][2] = matrix[row + 1][col + 2];
                    maxMatrix[2][0] = matrix[row + 2][col];
                    maxMatrix[2][1] = matrix[row + 2][col + 1];
                    maxMatrix[2][2] = matrix[row + 2][col + 2];
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int row = 0; row < maxMatrix.length; row++) {
            for (int col = 0; col < maxMatrix[row].length; col++) {
                System.out.print(maxMatrix[row][col] + " ");
            }
            System.out.println();
        }



    }

    private static int[][] readMatrix(int matrixSize, Scanner scanner) {
        int[][] matrix = new int[matrixSize][];
        for (int row = 0; row < matrixSize; row++) {

            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
        return matrix;
    }
}
