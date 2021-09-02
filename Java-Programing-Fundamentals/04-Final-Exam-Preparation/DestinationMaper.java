import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<separator>[=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        String locations = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(locations);
        int points = 0;
        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            String town = matcher.group("destination");
            int townLength = town.length();
            points += townLength;
            destinations.add(town);


        }
        System.out.print("Destinations: ");
        for (int i = 0; i <= destinations.size() -1; i++) {
            if (i == destinations.size() - 1) {
                System.out.print(destinations.get(i));

            } else {
                System.out.print(destinations.get(i) + ", ");
            }
        }
        System.out.println();
        System.out.printf("Travel Points: %d", points);

    }
}
