import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBox = Integer.parseInt(scanner.nextLine());
        int totalTons = 0;
        double priceTons1 = 0;
        double priceTons2 = 0;
        double priceTons3 = 0;
        int countBox1 = 0;
        int countBox2 = 0;
        int countBox3 = 0;

        for (int box = 1; box <= countBox; box++){
            int valueTon = Integer.parseInt(scanner.nextLine());
            totalTons += valueTon;
            if (valueTon <= 3){
                countBox1 += valueTon;
                priceTons1 += valueTon * 200;
            } else if (valueTon >= 4 && valueTon <= 11){
                countBox2 += valueTon;
                priceTons2 += valueTon * 175;
            } else if (valueTon >= 12){
                countBox3 += valueTon;
                priceTons3 += valueTon * 120;
            }

        }double sum = (priceTons1 + priceTons2 + priceTons3)/totalTons;
        double percentBox1 = 1.0 * countBox1/totalTons * 100;
        double percentBox2 = 1.0 * countBox2/totalTons * 100;
        double percentBox3 = 1.0 * countBox3/totalTons * 100;
        System.out.printf("%.2f%n", sum);
        System.out.printf("%.2f%%%n", percentBox1);
        System.out.printf("%.2f%%%n", percentBox2);
        System.out.printf("%.2f%%%n", percentBox3);
    }
}
