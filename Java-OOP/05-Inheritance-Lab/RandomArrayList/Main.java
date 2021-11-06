package RandomArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomArrayList<Integer> randomArrayList = new RandomArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            randomArrayList.add(i);
        }

        System.out.println(randomArrayList.getRandomElement());
    }
}
