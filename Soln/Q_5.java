//Write a Java program to accept n i.e. number of terms required by user by
//using command line arguments and display that many terms of Fibonacci series
public class Q_5 {
    public static void fibonacci(int terms){
        int f = 0, s = 1, next;
        System.out.printf("%d\t%d\t", f, s);
        for(int i = 2; i < terms; i++){
            next = f + s;
            System.out.printf("%d\t", next);
            f = s;
            s = next;
        }
    }
    public static void main(String[] args) {
//        System.out.println("Enter number of terms: ");
        int n = Integer.parseInt(args[0]);
        fibonacci(n);

    }
}
