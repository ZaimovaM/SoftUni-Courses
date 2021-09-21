import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);
        char[][] outputMatrix = new char[rows][cols];

        outputMatrix = fillMatrix(rows, cols, firstMatrix, secondMatrix);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols ; col++) {
                System.out.print(outputMatrix[row][col] + " ");
            }
            System.out.println();
        }



    }

    private static char[][] fillMatrix(int rows, int cols, char[][] firstMatrix, char[][] secondMatrix) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    matrix[row][col] = '*';
                } else {
                    matrix[row][col] = firstMatrix[row][col];
                }
            }
        }
        return matrix;
    }

    public static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");

            for (int i = 0; i < elements.length; i++) {
                char current = elements[i].charAt(0);
                matrix[row][i] = current;
            }
        }
        return matrix;
    }
}
