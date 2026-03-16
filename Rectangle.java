public class Rectangle extends Shape {

    int width;
    int length;

    public Rectangle(int width, int length, Coordinates position) {
        super(4, position);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public String display() {
        return "Rectangle area = " + getArea();
    }

}