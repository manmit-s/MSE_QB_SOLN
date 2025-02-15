//Write a Java program to find GCD of x and y by using recursive function
import java.util.*;
public class Q_25 {
    static int GCD(int n1, int n2){
        if(n2 == 0)
            return n1;
        return GCD(n2, n1 % n2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println("The GCD is "+ GCD(n1, n2));
    }
}
