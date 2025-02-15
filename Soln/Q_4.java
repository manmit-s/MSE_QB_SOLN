//Write a Java program to accept n i.e. integer number from user by using
//command line arguments and check is it Prime number or not
public class Q_4 {
    public static void main(String[] args) { 
         int num = Integer.parseInt(args[0]);
         boolean flag = true;
         for(int i = 2; i < num; i++){
             if(num%i == 0){
                flag = false;
                break;
             }
         }
         if(flag)
             System.out.println("The number is prime!");
         else
             System.out.println("The number is not prime.");
    }
}
//try to match edge cases