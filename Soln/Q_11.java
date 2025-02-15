//Write a Java program to accept x and y i.e. start and end of the set of
//integers from user by using command line arguments and display all Prime
//numbers present between x and y
public class Q_11 {
    static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        for(int i = x; i <= y; i++){
            if(isPrime(i))
                System.out.print(i + "\t");
        }
    }
}
