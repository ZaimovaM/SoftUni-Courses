import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));
        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuations = 0;

        for (String line : allLines) {
            for (int index = 0; index < line.length(); index++) {
                char currentChar = line.charAt(index);
                if (currentChar == ' ') {
                    continue;
                }
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    countVowels++;
                } else if (currentChar == '!' || currentChar == '?' || currentChar == '.' || currentChar == ',') {
                    countPunctuations++;
                } else {
                    countConsonants++;
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("count-characters.txt"));
        writer.write("Vowels: " + countVowels);
        writer.newLine();
        writer.write("Consonants: " + countConsonants);
        writer.newLine();
        writer.write("Punctuation: " + countPunctuations);
        writer.close();


    }
}
