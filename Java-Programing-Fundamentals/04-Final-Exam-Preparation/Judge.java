import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        Map<String, Map<String, Integer>> contest = new LinkedHashMap<>();
        Map<String, Integer> userAndPoints = new TreeMap<>();
        while (!data.equals("no more time")) {
            String[] splitData = data.split(" -> ");
            String userName = splitData[0];
            String contestName = splitData[1];
            int points = Integer.parseInt(splitData[2]);
            if (!contest.containsKey(contestName)) {
                contest.put(contestName, new TreeMap<>());

            }
            contest.get(contestName).put(userName, points);

            if (!userAndPoints.containsKey(userName)){
                userAndPoints.put(userName, points);
            } else {
                if(!contest.get(contestName).containsKey(userName)){
                    int currentPoints = userAndPoints.get(userName);
                    userAndPoints.put(userName, currentPoints + points);
                } else {
                    int currentPoints = userAndPoints.get(userName);
                    if(currentPoints <= points) {
                        userAndPoints.put(userName, points);
                    }
                }

            }


            data = scanner.nextLine();
        }

        contest.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " participants");
            List<Map.Entry<String, Integer>> sorted = entry.getValue().entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())).collect(Collectors.toList());
            int count = 1;
            for (Map.Entry<String, Integer> entr:sorted) {
                System.out.println(count++ + ". " + entr.getKey() + " <::> " + entr.getValue());
            }

        });

        System.out.println("Individual standings:");

       List<Map.Entry<String, Integer>> sorted =  userAndPoints.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue())).collect(Collectors.toList());
       int count = 1;
       for (Map.Entry<String, Integer> entry:sorted) {
           System.out.println(count++ + ". " + entry.getKey() +" -> " + entry.getValue());
       }


    }
}
