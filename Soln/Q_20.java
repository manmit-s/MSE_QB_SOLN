//Write a Java program to check the matrix is symmetric or not
import java.util.*;
public class Q_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int size = in.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = in.nextInt();
            }
        }
        boolean flag = true;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("The matrix is symmetric!");
        else
            System.out.println("The matrix is not symmetric!");

    }
}
