abstract class Shape {
    public abstract double getArea();
}

// Circle
class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}

// Rectangle
class Rectangle extends Shape {
    private double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getArea() {
        return w * h;
    }
}

public class Cir {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
    }
}
