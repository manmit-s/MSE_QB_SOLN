//Write a Java program to accept n i.e. number of terms to be considered and
//angle x in degrees from user by using command line arguments and
//calculate sin(x) using sine series
public class Q_7 {
    public static class Factorial{
        static int fact(int x){
            if(x == 0)
                return 1;
            return x*fact(x - 1);
        }
    }
    public static void main(String[] args) {
        double x, sum = 0;
        int num_of_terms, sign = 1;
        x = Double.parseDouble(args[0]);
        num_of_terms = Integer.parseInt(args[1]);

        for(int i = 0; i <= num_of_terms; i++){
            int pwr = 2*i - 1;
            sum += sign*Math.pow(x, pwr)/ Factorial.fact(pwr);
            sign = -sign;
        }
        System.out.println("Summation of series expansion = "+ sum);
    }
}
