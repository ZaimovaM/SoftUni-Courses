import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        String homeDir = System.getProperty("user.home");
        FileOutputStream outputStream = new FileOutputStream(homeDir + "\\"+ "out.txt");

        int value = inputStream.read();
        Set<Character> punctuations = Set.of(',','.','!','?');

        while (value != -1){
             char current = (char) value;
            if(!punctuations.contains(current)){
                System.out.print(current);
                outputStream.write(current);
            }
            value = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}
