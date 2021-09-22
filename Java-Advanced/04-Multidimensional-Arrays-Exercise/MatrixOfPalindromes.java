import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] fillMatrix (String[][] matrix) {
        char firstLetter = 'a';
        for (int row = 0; row < matrix.length; row++) {
            char secondLetter = firstLetter;
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.format("%c%c%c", firstLetter, secondLetter, firstLetter);
                secondLetter++;
            }
            firstLetter += 1;
        }
        return matrix;
    }
}
