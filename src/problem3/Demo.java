package src.problem3;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5);
        Shape ellipse = new Ellipse("Ellipse", 7, 4);
        Shape triangle = new Triangle("Triangle", 3, 4, 5);
        Shape equilateral = new EquilateralTriangle("Equilateral Triangle", 6);

        System.out.println(circle);
        System.out.println(ellipse);
        System.out.println(triangle);
        System.out.println(equilateral);
    }
}
