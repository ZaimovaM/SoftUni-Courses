import java.io.File;
import java.io.IOException;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Leyla\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        File[] filesInFolder = folder.listFiles();

        int folderSize = 0;
        for (File file : filesInFolder) {
            folderSize += file.length();
        }
        System.out.println("Folder size: " + folderSize);
    }
}

