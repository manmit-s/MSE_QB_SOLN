//Write a Java program to calculate Euclidean distance between two points by
//using command line arguments
public class Q_14 {
    static class Euclidean_Distance{
        double dist(int x1, int y1, int x2, int y2){
            double d = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
            return d;
        }
    }
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        x1 = Integer.parseInt(args[0]);
        y1 = Integer.parseInt(args[1]);
        x2 = Integer.parseInt(args[2]);
        y2 = Integer.parseInt(args[3]);
        Q_13.Euclidean_Distance a = new Q_13.Euclidean_Distance();
        System.out.println(a.dist(x1, y1, x2, y2));
    }
}
