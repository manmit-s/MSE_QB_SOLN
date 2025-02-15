//Write a Java program to accept x and y i.e. start and end of the set of
//integers from user by using command line arguments and display all
//Palindrome numbers present between x and y
public class Q_10 {
    static int rev(int num){
        int sum = 0, ld;
        while(num > 0){
            ld = num%10;
            sum = 10*sum + ld;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        for(int i = x; i <= y; i++){
            if(i == rev(i))
                System.out.print(i + "\t");
        }
    }
}