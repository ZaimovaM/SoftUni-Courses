import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int size = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];
        int[][] matrix = new int[size][size];
        if (pattern.equals("A")) {
           fillTheMatrixPatternA(matrix, scanner);
        } else {
           fillTheMatrixPatternB(matrix, scanner);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

    private static void fillTheMatrixPatternB(int[][] matrix, Scanner scanner) {
        int firstElement = 1;

        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 1) {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = firstElement++;
                }
            } else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = firstElement++;
                }
            }
        }

    }

    private static void fillTheMatrixPatternA(int[][] matrix, Scanner scanner) {
        int firstElement = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = firstElement++;
            }

        }

    }
}
