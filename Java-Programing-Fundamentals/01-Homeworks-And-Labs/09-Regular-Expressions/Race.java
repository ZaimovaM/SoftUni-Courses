import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String regexName = "[A-Za-z]";
        String regexDistance = "[0-9]";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);
        Map<String, Integer> racerDistance = new LinkedHashMap<>();

        for (String racer: racers) {
            racerDistance.put(racer, 0);
        }

        String command = scanner.nextLine();
        while (!command.equals("end of race")) {
            Matcher matcher = patternName.matcher(command);
            StringBuilder name = new StringBuilder();
            while (matcher.find()) {
                name.append(matcher.group());
            }
            Matcher matcher1 = patternDistance.matcher(command);
            int distance = 0;

            while (matcher1.find()){
                distance += Integer.parseInt(matcher1.group());
            }

            if (racerDistance.containsKey(name.toString())){
                int currentDistance = racerDistance.get(name.toString());
                racerDistance.put(name.toString(), currentDistance + distance);
            }


            command = scanner.nextLine();
        }
      List<String> firstThreeNames = racerDistance.entrySet().stream()
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
              .map(Map.Entry::getKey)
              .collect(Collectors.toList());

        System.out.println("1st place: " + firstThreeNames.get(0));
        System.out.println("2nd place: " + firstThreeNames.get(1));
        System.out.println("3rd place: " + firstThreeNames.get(2));

    }
}
