package person;

import java.util.Scanner;

public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    public static class Main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                Child child = new Child(name, age);

                System.out.println(child.getName());
                System.out.println(child.getAge());
            }

        }
}
