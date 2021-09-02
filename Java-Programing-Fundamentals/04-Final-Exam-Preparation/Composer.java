import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Composer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, PieceData> pieces = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputParts = input.split("\\|");
            String piece = inputParts[0];
            String composer = inputParts[1];
            String key = inputParts[2];

            PieceData currentPiece = new PieceData(composer, key);
            pieces.put(piece, currentPiece);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandParts = command.split("\\|");
            String typeCommand = commandParts[0];
            String piece = commandParts[1];
            if (typeCommand.equals("Add")) {
                String composer = commandParts[2];
                String key = commandParts[3];
                if (pieces.containsKey(piece)) {
                    System.out.println(piece + " is already in the collection!");
                } else {
                    PieceData newPiece = new PieceData(composer, key);
                    pieces.put(piece, newPiece);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }

            } else if (typeCommand.equals("Remove")) {
                if (!pieces.containsKey(piece)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                } else {
                    pieces.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                }
            } else if (typeCommand.equals("ChangeKey")) {
                String newKey = commandParts[2];
                if (pieces.containsKey(piece)) {

                    pieces.get(piece).setKey(newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }


            }


            command = scanner.nextLine();
        }
        pieces.forEach((key, value) ->
                System.out.printf("%s -> Composer: %s, Key: %s%n", key, value.getComposer(),value.getKey()));
    }
}

class PieceData {
    String composer;
    String key;

    public PieceData(String composer, String key) {
        this.composer = composer;
        this.key = key;
    }

    public String getComposer() {
        return composer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
