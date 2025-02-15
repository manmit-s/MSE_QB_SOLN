//Write a Java program to read n i.e. number of seconds by using command
//line argument and display it gets converted into how many hours, minutes
//and seconds
//example if n = 5000 then output : 1 hour 23 mins 20 sec
//import java.util.*;
public class Q_45 {
    public static void main(String[] args) {
        int ip_time, hr, min, s;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the time in seconds:");
        ip_time = Integer.parseInt(args[0]);

        hr = ip_time/3600;
        min = (ip_time%3600)/60;
        s = ip_time-(min*60)-(hr*3600);
//        s = ip_time/60;

        System.out.println(hr + " hour(s) " + min + " minute(s) " + s + " second(s)");
    }
}
