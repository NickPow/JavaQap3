package src.problem3;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 <= 0 || axis2 <= 0) {
            throw new IllegalArgumentException("Axes must be positive.");
        }
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b));
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
}
