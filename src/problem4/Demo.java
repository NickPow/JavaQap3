package src.problem4;

public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = {
            new Circle("Circle", 5),
            new Triangle("Triangle", 3, 4, 5)
        };

        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("\nScaling all shapes by a factor of 2...");
        for (Scalable shape : shapes) {
            shape.scale(2);
        }

        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }
}
