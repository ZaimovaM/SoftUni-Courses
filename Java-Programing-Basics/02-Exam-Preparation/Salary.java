import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int tab = 1; tab <= tabs; tab++){
            String nameTab = scanner.nextLine();
            if (nameTab.equals("Facebook")){
                salary -= 150;
            } else if (nameTab.equals("Instagram")){
                salary -= 100;
            } else if (nameTab.equals("Reddit")){
                salary-= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0){
            System.out.println(salary);

        }
    }
}
