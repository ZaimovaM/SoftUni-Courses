

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phones = scanner.nextLine();
        List<String> matchPhoneNumbers = new ArrayList<>();
        String regex = "\\+359(?<separator>[ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phones);

        while (matcher.find()){
            matchPhoneNumbers.add(matcher.group());
        }
        System.out.println(matchPhoneNumbers.toString().replaceAll("[\\[\\]]", ""));


    }
}
