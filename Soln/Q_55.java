import java.util.Scanner;

//Write OOJP to calculate area and circumference of a circle
public class Q_55 {
    private double radius; //private field for data encapsulation
    public Q_55(double radius){ //constructor
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
    public static void main(String[] args) {
        double r;
        Scanner in = new Scanner(System.in); //object for Scanner class
        System.out.println("Enter a radius: ");
        r = in.nextDouble();
        Q_55 circle = new Q_55(r); //object for Q_55
        System.out.println("Area = " + circle.getArea());
        System.out.println("Circumference = " + circle.getCircumference());
        in.close();
    }
}
