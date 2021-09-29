import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path pathFileOne = Path.of("C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        List<String> allLinesFirstFile = Files.readAllLines(pathFileOne);

        Path pathFileTwo= Path.of("C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        List<String> allLinesSecondFile = Files.readAllLines(pathFileTwo);

        PrintWriter writer = new PrintWriter("output-merge.txt");

        for (String line : allLinesFirstFile) {
            writer.println(line);
        }
        for (String line : allLinesSecondFile) {
            writer.println(line);
        }
        writer.close();


    }
}
