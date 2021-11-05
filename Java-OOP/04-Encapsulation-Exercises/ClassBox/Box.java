package ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setHeight(double height) {
        setSide(height, "Height");
        this.height = height;
    }

    private void setWidth(double width) {
        setSide(width, "Width");
        this.width = width;
    }

    private void setLength(double length) {
        setSide(length, "Length");
        this.length = length;
    }

    private void setSide(double param, String paramType){
        if(param <= 0){
            throw new IllegalArgumentException(paramType + " cannot be zero or negative.");

        }
    }

    public double calculateSurfaceArea(){
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * height * width + 2 * height * length;
    }

    public double calculateVolume(){
        return length * height * width;
    }
}
