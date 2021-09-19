import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> history = new ArrayDeque<>();

        String navigation = scanner.nextLine();
        String current = null;
        while (!navigation.equals("Home")) {

            boolean hasNoPrevURLs = false;
            if (navigation.equals("back")) {
                if (!history.isEmpty()) {
                    current = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    hasNoPrevURLs = true;

                }

            } else {
                if (current != null) {
                    history.push(current);
                }
                current = navigation;
            }
            if (!hasNoPrevURLs) {
                System.out.println(current);
            }


            navigation = scanner.nextLine();
        }
    }
}
