package PointInRectangle;

public class Rectangle {
    private final Point PointA;
    private final Point PointC;

    public Rectangle(Point pointA, Point pointC) {
        PointA = pointA;
        PointC = pointC;
    }

    public boolean isInside(Point p){
return p.isGreaterThanEqual(PointA) && p.isLessThanOrEqual(PointC);
    }
}
