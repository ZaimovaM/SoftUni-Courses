import java.util.Scanner;

public class Article {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine();
        String[] splitData = articleData.split(", ");
        String title = splitData[0];
        String content = splitData[1];
        String author = splitData[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] splitCommand = command.split(":\\s+");
            String commandParameter = splitCommand[1];
            if (splitCommand[0].equals("Edit")) {
                article.edit(commandParameter);

            } else if (splitCommand[0].equals("ChangeAuthor")) {
                article.changeAuthor(commandParameter);

            } else if (splitCommand[0].equals("Rename")) {
                article.rename(commandParameter);
            }

        }

        System.out.println(article.toString());

    }
}

