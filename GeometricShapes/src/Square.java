
public class Square extends FormasGeometricas{
    private double A;
    private double S;
    public double calcularArea() {
        System.out.println("Let's calculate the area of your square");
        System.out.println("Insert the following values");
        System.out.println("Insert value of sides: ");
        double S = s.nextDouble();

        double A = (S * S);

        System.out.println("The value of the area of your Square is: " + A);


        return A;
    }
}
