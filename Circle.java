public class Circle extends Shape {

    int radius;

    public Circle(int radius, Coordinates position) {
        super(0, position);
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String display() {
        return "Circle area = " + getArea();
    }

}