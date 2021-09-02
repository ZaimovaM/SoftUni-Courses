import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());
        int reducePow = 0;
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (currentChar == '>') {
                char power = input.charAt(index + 1);

                int pow = Character.getNumericValue(power);
                pow = pow + reducePow;
                    for (int i = index + 1; i <= index + pow; i++) {
                        if (i <= input.length() - 1) {
                            if (input.charAt(i) != '>') {
                                input.setCharAt(i, Character.MIN_VALUE);
                                reducePow++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (pow > reducePow) {
                        reducePow = pow - reducePow;
                    } else {
                        reducePow = 0;
                    }
                }

        }
        System.out.println(input);
    }
}
