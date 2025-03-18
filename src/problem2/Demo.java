package src.problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(p);
        p.move();
        System.out.println("After moving: " + p);
    }
}
