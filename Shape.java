public class Shape {

    Coordinates position;
    int sides;

    public Shape(int sides, Coordinates position){
        this.sides = sides;
        this.position = position;
    }

    public Coordinates getCoordinates(){
        return position;
    }

    public int getSides(){
        return sides;
    }

    public void translate(int dx, int dy){
        position.translate(dx,dy);
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public String display(){
        return "Shape with " + sides + " sides";
    }

}