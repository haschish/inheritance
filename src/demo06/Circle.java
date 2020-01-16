package demo06;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle() {

    }

    public Circle(Point center, double radius, String color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle {center: %s, radius: %.2f, color: %s}", center, radius, getColor());
    }
}

