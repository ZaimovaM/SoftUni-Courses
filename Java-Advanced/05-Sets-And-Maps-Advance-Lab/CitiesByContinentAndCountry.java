import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        for (int count = 1; count <= n; count++) {
            String tokens = scanner.nextLine();
            String continent = tokens.split(" ")[0];
            String country = tokens.split(" ")[1];
            String city = tokens.split(" ")[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countries = continents.get(continent);
            countries.putIfAbsent(country, new ArrayList<>());
            List<String> cities = countries.get(country);
            cities.add(city);
        }

        continents.entrySet().forEach(c -> {
            System.out.println(c.getKey() + ":");
            c.getValue().entrySet()
                    .forEach(e -> System.out.println(e.getKey() + " -> " + String.join(", ", e.getValue())));
        });


    }
}
