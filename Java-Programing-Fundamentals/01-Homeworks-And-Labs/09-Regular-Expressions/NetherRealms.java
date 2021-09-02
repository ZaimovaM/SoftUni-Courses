import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        String regexHealth = "[^0-9\\.\\*\\+\\-\\/]";
        Pattern patternHealth = Pattern.compile(regexHealth);
        String regexDigit = "\\-?\\d+\\.?\\d*";
        Pattern patternDigit = Pattern.compile(regexDigit);

        Map<String, Map<Integer, Double>> demons = new TreeMap<>();

        for (String name : input) {
            StringBuilder demonsName = new StringBuilder();
            int demonsHealth = 0;
            Matcher matcherHealth = patternHealth.matcher(name);
            while (matcherHealth.find()) {
                demonsName.append(matcherHealth.group());

            }
            char[] demonsArray = demonsName.toString().toCharArray();
            for (int i = 0; i < demonsArray.length; i++) {
                demonsHealth += (int) demonsArray[i];
            }

            double damage = 0;
            Matcher matcherDigit = patternDigit.matcher(name);

            while (matcherDigit.find()) {
                damage += Double.parseDouble(matcherDigit.group());
            }

            for (char symbol : name.toCharArray()) {
                if (symbol == '*') {
                    damage = damage * 2;
                } else if (symbol == '/') {
                    damage = damage / 2;
                }
            }

            demons.put(name, new HashMap<>());
            demons.get(name).put(demonsHealth, damage);


        }
        demons.forEach((key, value) -> {
            System.out.print(key);
            value.forEach((key1, value1) -> System.out.printf(" - %d health, %.2f damage%n", key1, value1));
        });


    }
}

