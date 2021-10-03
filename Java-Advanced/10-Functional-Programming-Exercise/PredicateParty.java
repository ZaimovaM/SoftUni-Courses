import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> people = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        BiFunction<List<String>, String, List<String>> removeEndWith =
                (list, word) -> {
                    list.removeIf(name -> name.endsWith(word));
                    list = list.stream().sorted().collect(Collectors.toList());
                    return list;
                };
        BiFunction<List<String>, String, List<String>> removeStartWith =
                (list, word) -> {
                    list.removeIf(name -> name.startsWith(word));
                    list = list.stream().sorted().collect(Collectors.toList());
                    return list;
                };
        BiFunction<List<String>, Integer, List<String>> removeLength =
                (list, length) -> {
                    list.removeIf(name -> name.length() == length);
                    list = list.stream().sorted().collect(Collectors.toList());
                    return list;
                };

        BiFunction<List<String>, String, List<String>> doubleEndWith =
                (list, word) -> {
                    List<String> addedNames = new ArrayList<>();
                    for (String name : list) {
                        if (name.endsWith(word)) {
                            addedNames.add(name);
                        }
                    }
                    addedNames.addAll(list);
                    addedNames = addedNames.stream().sorted().collect(Collectors.toList());
                    return addedNames;
                };
        BiFunction<List<String>, String, List<String>> doubleStartWith =

                (list, word) -> {
                    List<String> addedNames = new ArrayList<>();
                    for (String name : list) {
                        if (name.startsWith(word)) {
                            addedNames.add(name);
                        }
                    }
                    addedNames.addAll(list);
                    addedNames = addedNames.stream().sorted().collect(Collectors.toList());
                    return addedNames;
                };
        BiFunction<List<String>, Integer, List<String>> doubleLength =
                (list, length) -> {
                    List<String> addedNames = new ArrayList<>();
                    for (String name : list) {
                        if (name.length() == length) {
                            addedNames.add(name);
                        }
                    }
                    addedNames.addAll(list);
                    addedNames = addedNames.stream().sorted().collect(Collectors.toList());
                    return addedNames;
                };


        while (!command.equals("Party!")) {
            String[] commandParts = command.split("\\s+");
            String commandType = commandParts[0];
            String commandCriteria = commandParts[1];
            String word = commandParts[2];
            if (commandType.equals("Remove")) {
                if (commandCriteria.equals("StartsWith")) {
                   people = removeStartWith.apply(people, word);
                } else if (commandCriteria.equals("EndsWith")) {
                    people = removeEndWith.apply(people, word);
                } else {
                    people = removeLength.apply(people, Integer.parseInt(word));
                }

            } else if (commandType.equals("Double")) {
                if (commandCriteria.equals("StartsWith")) {
                    people = doubleStartWith.apply(people, word);
                } else if (commandCriteria.equals("EndsWith")) {
                   people = doubleEndWith.apply(people, word);
                } else {
                    people = doubleLength.apply(people, Integer.parseInt(word));
                }

            }
            command = scanner.nextLine();
        }
        if (people.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.print(String.join(", ", people).toString());
            System.out.println(" are going to the party!");
        }

    }
}
