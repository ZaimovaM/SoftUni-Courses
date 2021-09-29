import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        BufferedWriter writer = new BufferedWriter(new PrintWriter("out-third-line.txt"));

        String line = reader.readLine();
        int count = 1;

        while (line != null){
            if (count % 3 == 0){
               writer.write(line + System.lineSeparator());
            }
            line = reader.readLine();
            count++;
        }
        writer.flush();
    }
}
