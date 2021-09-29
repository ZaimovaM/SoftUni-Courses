import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("out-capitals.txt"));
        Files.readAllLines(Path.of(path)).forEach(
                line -> {
                    try {
                        writer.write(line.toUpperCase());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();
    }
}
