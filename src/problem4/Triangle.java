package src.problem4;

public class Triangle extends Shape implements Scalable {
    private double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalArgumentException("Invalid Triangle Sides");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive.");
        }
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}
