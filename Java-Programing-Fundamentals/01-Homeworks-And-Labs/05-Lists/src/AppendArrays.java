import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> appendArrays = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(appendArrays);


       System.out.println(appendArrays.toString().replace("[", "")
                                                 .replace("]", "")
                                                     .replace(",","")
                                                    .trim()
                                                    .replaceAll("\\s+", " "));


    }
}
