import java.util.ArrayList;

public class ShapeList {

    ArrayList<Shape> listOfShapes = new ArrayList<>();

    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    public Shape getShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos);
        }
        return null;
    }

    public Shape removeShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.remove(pos);
        }
        return null;
    }

    public void translateShapes(int dx, int dy) {
        for (Shape s : listOfShapes) {
            s.translate(dx, dy);
        }
    }

    public String display() {
        String result = "";
        for (Shape s : listOfShapes) {
            result = result + s.display() + "\n";
        }
        return result;
    }
}