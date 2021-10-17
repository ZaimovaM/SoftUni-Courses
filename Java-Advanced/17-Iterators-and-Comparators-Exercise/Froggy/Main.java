package Froggy;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stonesArray = scanner.nextLine().split(",\\s+");
        Lake lake = new Lake(Arrays.stream(stonesArray)
                .map(Integer::parseInt).collect(Collectors.toList()));

        List<String> output = new ArrayList<>();

        for (Integer stone : lake){
            output.add(String.valueOf(stone));
        }

        System.out.println(String.join(", ", output));
    }

}
