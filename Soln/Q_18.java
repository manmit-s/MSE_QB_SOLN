//Write a Java program to check the given 3-digit integer number is
//Armstrong number or not
import java.util.*;
public class Q_18 {
    static class Action{
        int numOfDigits(int num){
            int count = 0;
            while(num > 0){
                num /= 10;
                count++;
            }
            return count;
        }
        boolean isArmstrong(int num){
            int numOfDigits = numOfDigits(num);
            double sum = 0;
            int n_copy = num;
            while(n_copy > 0){
                int ld = n_copy%10;
                sum += Math.pow(ld, numOfDigits);
                n_copy /= 10;
            }
            if(sum == num)
                return  true;
            return false;
        }
    }
    public static void main(String[] args) {
    int num, count, sum;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    num = in.nextInt();
    Action a = new Action();
    if(a.isArmstrong(num))
        System.out.println("The number is an Armstrong Number!");
    else
        System.out.println("It is not an Armstrong Number");
    }
}
