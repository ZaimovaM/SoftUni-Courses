import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        int value = fileInputStream.read();

        while (value != -1){
            System.out.print(Integer.toBinaryString(value) + " ");
            value = fileInputStream.read();
        }
    }
}
