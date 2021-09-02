import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double points = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOtherBalls = 0;

        for (int balls = 1; balls <= x ; balls++) {
            String color = scanner.nextLine();

            if (color.equals("red")){
                points += 5;
                countRed++;
            } else if (color.equals("orange")) {
                points += 10;
                countOrange++;
            } else if (color.equals("yellow")) {
                points += 15;
                countYellow++;
            } else if (color.equals("white")) {
                points += 20;
                countWhite++;
            } else if (color.equals("black")){
                points = Math.floor (points / 2) ;
                countBlack++;
            }
            if (!color.equals("black") && !color.equals("white") && !color.equals("yellow") && !color.equals("red") && !color.equals("orange")){
                countOtherBalls++;
            }

        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Points from red balls: %d%n", countRed);
        System.out.printf("Points from orange balls: %d%n", countOrange);
        System.out.printf("Points from yellow balls: %d%n", countYellow);
        System.out.printf("Points from white balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countOtherBalls);
        System.out.printf("Divides from black balls: %d%n", countBlack);
    }
}
