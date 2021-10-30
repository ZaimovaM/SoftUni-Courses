import java.util.Scanner;

public class Python {
    static int startRow = 0;
    static int startCol = 0;
    static int food = 0;
    static int pythonLength = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        char[][] matrix = new char[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
          String line = scanner.nextLine().replaceAll(" ", "");
            matrix[row] = line.toCharArray();
            if(line.contains("s")){
                startRow = row;
                startCol = line.indexOf('s');
            }
        }


        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (matrix[row][col] == 's') {
                    startRow = row;
                    startCol = col;
                } else if (matrix[row][col] == 'f') {
                    food++;
                }
            }
        }
        int pythonLength = 1;
        boolean isKilled = false;

        for (String command : commands) {
            if (command.equals("up")) {
                startRow = startRow - 1;
                if (isOutOfBounds(startRow, startCol, matrixSize)) {
                    startRow = matrixSize - 1;
                }
            } else if (command.equals("down")) {
                startRow = startRow + 1;
                if (isOutOfBounds(startRow, startCol, matrixSize)) {
                    startRow = 0;
                }
            } else if (command.equals("right")) {
                startCol = startCol + 1;
                if (isOutOfBounds(startRow, startCol, matrixSize)) {
                    startCol = 0;
                }
            } else if (command.equals("left")) {
                startCol = startCol - 1;
                if (isOutOfBounds(startRow, startCol, matrixSize)) {
                    startCol = matrixSize - 1;
                }
            }

            if (matrix[startRow][startCol] == 'f') {
                pythonLength++;
                food--;
                if (food == 0){
                    break;
                }
            } else if (matrix[startRow][startCol] == 'e') {
                isKilled = true;
                break;
            }
        }
        if (isKilled) {
            System.out.println("You lose! Killed by an enemy!");
        } else if (food == 0) {
            System.out.printf("You win! Final python length is %d", pythonLength);
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.", food);
        }

    }

    public static boolean isOutOfBounds(int row, int col, int matrixSize) {
        return row < 0 || row >= matrixSize || col < 0 || col >= matrixSize;
    }


}
