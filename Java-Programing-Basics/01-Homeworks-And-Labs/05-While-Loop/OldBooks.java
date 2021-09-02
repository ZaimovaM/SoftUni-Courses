import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countBooks = 0;
        while (true){
            String nameBook = scanner.nextLine();
            if (input.equals(nameBook)){
                System.out.printf("You checked %d books and found it.", countBooks);
                break;
            } else if (nameBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", countBooks);
                break;
            }
            countBooks++;
        }

    }
}
