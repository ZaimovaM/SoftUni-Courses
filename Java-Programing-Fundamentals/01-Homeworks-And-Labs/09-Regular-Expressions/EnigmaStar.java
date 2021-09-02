import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EnigmaStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regexForEncrypt = "[starSTAR]";
        String regexForDecrypt = "@(?<planetName>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*:(?<population>[0-9]+)![^\\@\\-\\!\\:\\>]*(?<attack>[AD])![^\\@\\-\\!\\:\\>]*->(?<soliderCount>[0-9]+)";
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            String encryptedMassage = scanner.nextLine();
            Pattern patternEncrypt = Pattern.compile(regexForEncrypt);
            Matcher matcherEncrypt = patternEncrypt.matcher(encryptedMassage);
            int key = 0;
            while (matcherEncrypt.find()) {
                key++;
            }
            StringBuilder decryptMassage = new StringBuilder();
            for (char symbol : encryptedMassage.toCharArray()) {
                int currentSymbol = (int) symbol - key;
                char newSymbol = (char) currentSymbol;
                decryptMassage.append(newSymbol);

            }
            Pattern patternDecrypt = Pattern.compile(regexForDecrypt);
            Matcher matcherDecrypt = patternDecrypt.matcher(decryptMassage);
            if (matcherDecrypt.find()){
                String planetName = matcherDecrypt.group("planetName");
                String attackType = matcherDecrypt.group("attack");
                if (attackType.equals("A")){
                    attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }


            }
        }
        attacked = attacked.stream().sorted(String::compareTo).collect(Collectors.toList());
        destroyed = destroyed.stream().sorted(String::compareTo).collect(Collectors.toList());


            System.out.println("Attacked planets: " + attacked.size());

                for (String planet : attacked) {
                    System.out.println("-> " + planet);
                }



            System.out.println("Destroyed planets: " + destroyed.size());

                for (String planet : destroyed) {
                    System.out.println("-> " + planet);
                }


    }
}
