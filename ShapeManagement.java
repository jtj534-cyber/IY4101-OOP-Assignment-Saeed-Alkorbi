import java.util.Scanner;

public class ShapeManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ShapeList list = new ShapeList();

        int choice;

        do {
            System.out.println("1 Add Rectangle");
            System.out.println("2 Add Square");
            System.out.println("3 Add Circle");
            System.out.println("4 Add Triangle");
            System.out.println("5 Remove Shape");
            System.out.println("6 Get Shape Info");
            System.out.println("7 Area and Perimeter");
            System.out.println("8 Display All Shapes");
            System.out.println("9 Translate All Shapes");
            System.out.println("10 Scale All Shapes");
            System.out.println("0 Exit");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter width:");
                int w = input.nextInt();
                System.out.println("Enter length:");
                int l = input.nextInt();

                Rectangle r = new Rectangle(w, l, new Coordinates(0, 0));
                list.addShape(r);
            }

            else if (choice == 2) {
                System.out.println("Enter side:");
                int s = input.nextInt();

                Square sq = new Square(s, new Coordinates(0, 0));
                list.addShape(sq);
            }

            else if (choice == 3) {
                System.out.println("Enter radius:");
                int r = input.nextInt();

                Circle c = new Circle(r, new Coordinates(0, 0));
                list.addShape(c);
            }

            else if (choice == 4) {
                System.out.println("Enter x1:");
                int x1 = input.nextInt();
                System.out.println("Enter y1:");
                int y1 = input.nextInt();

                System.out.println("Enter x2:");
                int x2 = input.nextInt();
                System.out.println("Enter y2:");
                int y2 = input.nextInt();

                System.out.println("Enter x3:");
                int x3 = input.nextInt();
                System.out.println("Enter y3:");
                int y3 = input.nextInt();

                Triangle t = new Triangle(
                        new Coordinates(x1, y1),
                        new Coordinates(x2, y2),
                        new Coordinates(x3, y3)
                );
                list.addShape(t);
            }

            else if (choice == 5) {
                System.out.println("Enter position:");
                int pos = input.nextInt();

                Shape removed = list.removeShape(pos);

                if (removed == null) {
                    System.out.println("Invalid position");
                } else {
                    System.out.println("Shape removed");
                }
            }

            else if (choice == 6) {
                System.out.println("Enter position:");
                int pos = input.nextInt();

                Shape s = list.getShape(pos);

                if (s == null) {
                    System.out.println("Invalid position");
                } else {
                    System.out.println(s.display());
                }
            }

            else if (choice == 7) {
                System.out.println("Enter position:");
                int pos = input.nextInt();

                Shape s = list.getShape(pos);

                if (s == null) {
                    System.out.println("Invalid position");
                } else {
                    System.out.println("Area = " + s.getArea());
                    System.out.println("Perimeter = " + s.getPerimeter());
                }
            }

            else if (choice == 8) {
                System.out.println(list.display());
            }

            else if (choice == 9) {
                System.out.println("Enter dx:");
                int dx = input.nextInt();
                System.out.println("Enter dy:");
                int dy = input.nextInt();

                list.translateShapes(dx, dy);
                System.out.println("Shapes translated");
            }

            else if (choice == 10) {
                System.out.println("Enter factor:");
                int factor = input.nextInt();
                System.out.println("Enter sign (true for multiply, false for divide):");
                boolean sign = input.nextBoolean();

                list.scale(factor, sign);
                System.out.println("Shapes scaled");
            }

        } while (choice != 0);

        System.out.println("Program ended");
    }
}
