import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(matrixSize, scanner);
        int[] firstDiagonal = new int[matrixSize];
        int[] secondDiagonal = new int[matrixSize];

        int row = 0;
        int col = 0;
        for (int index = 0; index < firstDiagonal.length; index++) {
            firstDiagonal[index] = matrix[row][col];
            row++;
            col++;
        }
        row = matrixSize - 1;
        col = 0;
        for (int index = 0; index < secondDiagonal.length; index++) {
            secondDiagonal[index] = matrix[row][col];
            row--;
            col++;
        }
        for (int element:firstDiagonal) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (int element:secondDiagonal) {
            System.out.print(element + " ");
        }
    }

    private static int[][] readMatrix(int matrixSize, Scanner scanner) {
        int[][] matrix = new int[matrixSize][];
        for (int row = 0; row < matrixSize; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        return matrix;
    }
}
