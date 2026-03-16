public class Triangle extends Shape {

    Coordinates p1;
    Coordinates p2;
    Coordinates p3;

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3) {
        super(3, p1);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return a + b + c;
    }

    public String display() {
        return "Triangle perimeter = " + getPerimeter();
    }

}