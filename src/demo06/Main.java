package demo06;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);


        Circle circle = new Circle(p1, 1, "green");
        Shape s = circle;
        Object o = circle;

    }

    private static void printArrayElements(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }

    private static Shape findShapeWithMaxArea(Shape[] arr) {
        Shape maxShape = null;
        double maxArea = Double.NEGATIVE_INFINITY;
        for (Shape shape: arr) {
            double area = shape.getArea();
            if (area > maxArea) {
                maxShape = shape;
                maxArea = area;
            }
        }

        return maxShape;
    }
}
