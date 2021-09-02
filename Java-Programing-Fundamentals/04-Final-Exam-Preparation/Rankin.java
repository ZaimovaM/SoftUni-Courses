import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Rankin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contests = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end of contests")) {
            String[] splitInput = input.split(":");
            String contest = splitInput[0];
            String password = splitInput[1];
            contests.put(contest, password);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        Map <String, Map<String, Integer>> submissions = new TreeMap<>();
        Map <String, Integer> namesAndPoints = new LinkedHashMap<>();

        while (!command.equals("end of submissions")){
            String[] splitCommand = command.split("=>");
            String newContest = splitCommand[0];
            String newPassword = splitCommand[1];
            String name = splitCommand[2];
            int points = Integer.parseInt(splitCommand[3]);

            if (contests.containsKey(newContest)){
                if (newPassword.equals(contests.get(newContest))){
                    if (!submissions.containsKey(name)) {
                        submissions.put(name, new LinkedHashMap<>());
                    }
                    submissions.get(name).put(newContest, points);

                    }
                if(!namesAndPoints.containsKey(name)) {
                    namesAndPoints.put(name, points);
                } else {
                    int currentPoints = namesAndPoints.get(name);
                    namesAndPoints.put(name, currentPoints + points);
                }

                }



            command = scanner.nextLine();
            }


        namesAndPoints.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .findFirst().stream().forEach(first -> System.out.printf("Best candidate is %s with total %d points.%n", first.getKey(), first.getValue()));
        System.out.println("Ranking: ");
     submissions.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(cont -> System.out.println("#  " + cont.getKey() + " -> " + cont.getValue()));
        });






        }
    }

