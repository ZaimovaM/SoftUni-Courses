import java.util.Scanner;
public class Scholarship {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double income = Double.parseDouble(scanner.nextLine());
            double grade = Double.parseDouble(scanner.nextLine());
            double salary = Double.parseDouble(scanner.nextLine());

            double socialScholarship = Math.floor(salary * 0.35);
            double exScholarship = Math.floor(grade * 25);

            if (income > salary){
                if (grade >= 5.50){
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", exScholarship);
                }
                else{
                    System.out.println("You cannot get a scholarship!");
                }
            }
            else {
                if (grade >= 4.50 && grade < 5.50){
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                }
                else if (grade >= 5.50){
                    if (exScholarship >= socialScholarship) {
                        System.out.printf("You get a scholarship for excellent results %.0f BGN", exScholarship);
                    }
                    else {
                        System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                    }
                }
                else {
                    System.out.println("You cannot get a scholarship!");
                }
            }
        }
    }



