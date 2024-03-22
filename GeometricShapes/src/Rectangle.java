
public class Rectangle extends FormasGeometricas{
    private double A;
    private double b;
    private double h;

    public double calcularArea() {
        System.out.println("Let's calculate the area of your rectangle");
        System.out.println("Insert the following values");
        System.out.println("Insert value of base: ");
        double b = s.nextDouble();
        System.out.println("Insert value of height: ");
        double h = s.nextDouble();

        double A = b * h;

        System.out.println("The value of the area of your Rectangle is: " + A);

        return A;
    }
}
