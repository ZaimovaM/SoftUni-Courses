import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeMatrix = scanner.nextLine();
        int rows = Integer.parseInt(sizeMatrix.split(", ")[0]);
        int cols = Integer.parseInt(sizeMatrix.split(", ")[1]);
        int[][] matrix = readMatrix(rows, scanner);

        // 7, 1, 3, 3, 2, 1
        //1, 3, 9, 8, 5, 6
        //4, 6, 7, 9, 1, 0
        int maxSum = 0;
        int[][] maxMatrix = new int[2][2];
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentNum = matrix[row][col];
                int rightNum = matrix[row][col + 1];
                int bottomNum = matrix[row + 1][col];
                int bottomRight = matrix[row + 1][col + 1];
                int currentSum = currentNum + rightNum + bottomNum + bottomRight;
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    maxMatrix[0][0] = currentNum;
                    maxMatrix[0][1] = rightNum;
                    maxMatrix[1][0] = bottomNum;
                    maxMatrix[1][1] = bottomRight;
                }
            }
        }
        for (int row = 0; row < maxMatrix.length; row++) {
            for (int col = 0; col < maxMatrix[row].length; col++) {
                System.out.print(maxMatrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);


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
