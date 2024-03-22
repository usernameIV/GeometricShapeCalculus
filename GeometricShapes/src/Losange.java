
public class Losange extends FormasGeometricas{
    private double A;
    private double D;
    private double d;

    public double calcularArea() {
        System.out.println("Let's calculate the area of your losange");
        System.out.println("Insert the following values");
        System.out.println("Insert value of larger diagonal: ");
        double D = s.nextDouble();
        System.out.println("Insert value of shorter diagonal: ");
        double d = s.nextDouble();

        double A = (D * d) / 2;

        System.out.println("The value of the area of your losange is: " + A);


        return A;
    }
}
