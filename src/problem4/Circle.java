package src.problem4;

public class Circle extends Shape implements Scalable {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive.");
        }
        radius *= factor;
    }
}
