import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> compounds = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            String elements = scanner.nextLine();
            String[] components = elements.split(" ");
            Collections.addAll(compounds, components);
        }
        compounds.forEach(e -> System.out.print(e + " "));


    }
}
