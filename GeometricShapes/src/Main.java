import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {

        System.out.println("This program will help you calculate the area of some geometric shapes...");

        Scanner s = new Scanner(System.in);

        FormasGeometricas formasGeometricas = new FormasGeometricas() {
            @Override
            public double calcularArea() {
                return 0;
            }
        };

        formasGeometricas.initUser();

    }
}