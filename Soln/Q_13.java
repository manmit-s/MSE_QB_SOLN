//Write a Java program to calculate Euclidean distance between two points
public class Q_13 {
    static class Euclidean_Distance{
        double dist(int x1, int y1, int x2, int y2){
            double d = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
            return d;
        }
    }
    public static void main(String[] args) {
        int x1 = 6, x2 = 9, y1 = 9, y2 = 6;
        Euclidean_Distance a = new Euclidean_Distance();
        System.out.println(a.dist(x1, y1, x2, y2));
    }
}
