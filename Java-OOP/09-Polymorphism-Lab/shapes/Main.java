package shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(27, 13);

        printShape(circle);
        printShape(rectangle);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());
    }
}
