//Write OOJP to calculate volume of Sphere, Cube and Cylinder by using three
//methods with same name volume()
public class Q_65 {
    public double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double volume(int side) {
        return Math.pow(side, 3);
    }

    public double volume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Q_65 calculator = new Q_65();

        double sphereRadius = 5.0;
        System.out.println("Volume of Sphere: " + calculator.volume(sphereRadius));

        int cubeSide = 3;
        System.out.println("Volume of Cube: " + calculator.volume(cubeSide));

        double cylinderRadius = 4.0;
        double cylinderHeight = 6.0;
        System.out.println("Volume of Cylinder: " + calculator.volume(cylinderRadius, cylinderHeight));
    }
}