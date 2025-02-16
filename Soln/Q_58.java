//Write OOJP to calculate Euclidean distance between two points p1(x,y) and
//p2(x,y)
import java.util.Scanner;
public class Q_58 {
    static class Points{
        private double x,y;
        public Points(double x, double y){
            this.x = x;
            this.y = y;
        }
        double distance(Points other){
            return Math.sqrt(Math.pow((x - other.x), 2) + Math.pow((y - other.y), 2));
        }
    }
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates of point 1: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        System.out.println("Enter the coordinates of point 2: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        Points p1 = new Points(x1, y1);
        Points p2 = new Points(x2, y2);
        System.out.println("The Euclidean distance = "+ p1.distance(p2));
        in.close();
    }
}
