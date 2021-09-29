import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordsCount {
    public static void main(String[] args) throws IOException {
       Path pathToWords = Path.of("C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        List<String> words = Files.readAllLines(pathToWords);
        words.forEach(line -> Arrays.stream(line.split("\\s+")).forEach(word-> wordsCount.put(word, 0)));

        Path pathToText = Path.of("C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        List<String> text = Files.readAllLines(pathToText);
        for (String line : text) {
            String[] wordInLine = line.split(" ");
            for (String word : wordInLine) {
                if (word.contains(",")){
                    word = word.replaceAll(",", " ");
                }
                if (wordsCount.containsKey(word)){
                    int currentCount = wordsCount.get(word);
                    wordsCount.put(word, currentCount + 1);
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output-words.txt"));
        wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(stringIntegerEntry -> {
            try {
                writer.write(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.close();
    }
}
