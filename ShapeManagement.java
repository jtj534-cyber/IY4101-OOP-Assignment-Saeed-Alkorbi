import java.util.Scanner;

public class ShapeManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ShapeList list = new ShapeList();

        int choice;

        do {

            System.out.println("1 Add Rectangle");
            System.out.println("2 Display Shapes");
            System.out.println("3 Remove Shape");
            System.out.println("0 Exit");

            choice = input.nextInt();

            if(choice == 1){

                System.out.println("Enter width:");
                int w = input.nextInt();

                System.out.println("Enter length:");
                int l = input.nextInt();

                Rectangle r = new Rectangle(w,l,new Coordinates(0,0));

                list.addShape(r);

            }

            else if(choice == 2){

                System.out.println(list.display());

            }

            else if(choice == 3){

                System.out.println("Enter position:");
                int pos = input.nextInt();

                list.removeShape(pos);

            }

        } while(choice != 0);

    }
}