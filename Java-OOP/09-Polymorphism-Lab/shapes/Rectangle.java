package shapes;

public class Rectangle implements Shape {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return this.height * 2 + this.width * 2;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }
}
