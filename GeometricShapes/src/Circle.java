
public class Circle extends FormasGeometricas{
    private double A;
    private double Pi;
    private double r;

    public double calcularArea() {
        Pi = 3.14;
        System.out.println("Let's calculate the area of your circle");
        System.out.println("Insert the following values");
        System.out.println("Insert value of radius: ");
        double r = s.nextDouble();
        double A = (r * r) * Pi;

        System.out.println("The value of the area of your Circle is: " + A);

        return A;
    }
}
