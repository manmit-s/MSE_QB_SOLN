//Write a Java program to accept coordinates of a point by using command
//line arguments and find the quadrant in which it lies
public class Q_3 {
    public static void main(String[] args) { 
         int x, y;
         x = Integer.parseInt(args[0]);
         y = Integer.parseInt(args[1]);
        //Make sure to update program arguments if you are on Intelli J idea IDE or any other IDE

         if(x > 0 && y > 0)
             System.out.println("First Quadrant");
         else if(x < 0 && y > 0)
             System.out.println("Second Quadrant");
         else if(x < 0 && y < 0)
             System.out.println("Third Quadrant");
         else if(x > 0 && y < 0)
             System.out.println("Fourth Quadrant");
    }
}
