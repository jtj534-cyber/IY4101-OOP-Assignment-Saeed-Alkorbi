public class Coordinates {

    int x;
    int y;

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy){
        x = x + dx;
        y = y + dy;
    }

    public String display(){
        return "X = " + x + " Y = " + y;
    }

    public double distance(Coordinates p){
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

}