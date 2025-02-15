//Write a Java program to accept position of the element required to be
//deleted from array, delete that element by shifting remaining elements
//towards left
import java.util.*;
public class Q_9 {
static class Action {
    void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        Action a = new Action();
        a.display(arr, size);

        System.out.print("Enter the position if element to be deleted: \n");
        int pos = in.nextInt();

        for(int i = pos-1; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        a.display(arr, size-1);

        in.close();
    }
}
