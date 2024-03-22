
public class Trapeze extends FormasGeometricas{
    private double A;

    public double calcularArea() {
        System.out.println("Let's calculate the area of your trapeze");
        System.out.println("Insert the following values");
        System.out.println("Insert value of larger base: ");
        double B = s.nextDouble();
        System.out.println("Insert value of smaller base: ");
        double b = s.nextDouble();
        System.out.println("Insert value of height: ");
        double h = s.nextDouble();

        double A = (B * b) * h / 2;

        System.out.println("The value of the area of your Trapeze is: " + A);

        return A;
    }
}
