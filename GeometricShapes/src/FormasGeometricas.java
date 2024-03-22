import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class FormasGeometricas {

    public FormasGeometricas() {

    }

    public abstract double calcularArea();

    Scanner s = new Scanner(System.in);

    public void initUser() {
        FormasGeometricas triangle = new Triangle();
        FormasGeometricas square = new Square();
        FormasGeometricas trapeze = new Trapeze();
        FormasGeometricas losange = new Losange();
        FormasGeometricas circle = new Circle();
        FormasGeometricas rectangle = new Rectangle();


        boolean exit = false;
        do {
            try {
                System.out.println(" Choose witch area you wanna calculate ");
                System.out.println("#     1 – Calculate triangle         #");
                System.out.println("#     2 - Calculate square           #");
                System.out.println("#     3 - Calculate trapeze          #");
                System.out.println("#     4 – Calculate losange          #");
                System.out.println("#     5 – Calculate círcle           #");
                System.out.println("#     6 – Calculate rectangle        #");
                System.out.println("#   #   #   #   #   #   #   #   #   #");
                System.out.println("Insert here: ");

                int escolha = s.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println(triangle.calcularArea());
                        break;
                    case 2:
                        System.out.println(square.calcularArea());
                        break;
                    case 3:
                        System.out.println(trapeze.calcularArea());
                        break;
                    case 4:
                        System.out.println(losange.calcularArea());
                        break;
                    case 5:
                        System.out.println(circle.calcularArea());
                        break;
                    case 6:
                        System.out.println(rectangle.calcularArea());
                        break;
                    default:
                        System.out.println("Invalid option");
                        initUser();
                }
            } catch (InputMismatchException e) {
                System.out.println("Thats not an option");
                s.next();
            }
        } while (!exit);

    }



}
