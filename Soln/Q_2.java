//Write a Java program to accept a 4 digit integer number  by using command
//line arguments and check that its two 2-digit parts are equal or not.
public class Q_2 {
    public static void main(String[] args) {
         int num = Integer.parseInt(args[0]);
         //Make sure to update program arguments if you are on Intelli J idea IDE or any other IDE
         int fpart = num/100;
         int spart = num%100;

         if(fpart == spart){
             System.out.println("The first part and second part are equal!");
         }
         else
             System.out.println("They are not equal.");

    }
}
