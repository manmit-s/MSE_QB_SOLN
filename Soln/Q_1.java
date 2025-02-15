//Write a Java program to calculate Simple and Compound Interest

import java.util.*;
public class Q_1 {
    public static void main(String[] args) {
        double principal, amount, si, ci, rate, time;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        principal = in.nextDouble();
        System.out.print("Enter the rate: ");
        rate = in.nextDouble();
        System.out.print("Enter the time: ");
        time = in.nextDouble();

        int choice;
        do {
            System.out.println("How will you like to calculate the interest?");
            System.out.println("Press 0 --> Simple Interest, 1 --> Compound Interest.");
            choice = in.nextInt();
        }while(choice !=0 && choice !=1);
        boolean flag = (choice == 0);
        if(flag){
            si = (principal*rate*time)/100;
            amount = principal + si;
            System.out.printf("Interest calculated = %.2f || Total Amount = %.2f", si, amount);
        }
        else{
            amount = principal*Math.pow((1 + (rate/100)), time);
            ci = amount - principal;
            System.out.printf("Interest calculated = %.2f || Total Amount = %.2f", ci, amount);
        }
        in.close();
    }
}