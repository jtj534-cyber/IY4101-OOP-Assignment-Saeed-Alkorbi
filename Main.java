public class Main {
    public static void main(String[] args) {

        Coordinates p = new Coordinates(10,20);

        System.out.println(p.display());

        p.translate(5,5);

        System.out.println(p.display());

    }
}