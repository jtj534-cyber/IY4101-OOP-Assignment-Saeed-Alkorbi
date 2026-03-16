public class Square extends Shape {

    int side;

    public Square(int side, Coordinates position) {
        super(4, position);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public String display() {
        return "Square area = " + getArea();
    }

}