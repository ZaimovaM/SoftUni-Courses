package ListUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(15, 1, 33, 82);
        List<String> strings = List.of("15", "1", "33", "82");

        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(strings));
    }
}
