import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String pathStr = "C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Path path = Path.of(pathStr);
        List<String> allLines = Files.readAllLines(path);

        allLines.stream().map(String::toCharArray).forEach(
                charArr -> {
                    int sum = 0;
                    for (char currentChar : charArr) {
                        sum += currentChar;
                    }
                    System.out.println(sum);
                }
        );
    }
}
