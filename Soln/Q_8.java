//Write a Java program to accept new value and position where it is required
//to be inserted, insert it in the specified position by shifting remaining
//element towards right
import java.util.*;
public class Q_8 {
static class Action{
    void display(int arr[], int size){
        for(int i = 0; i < size; i++){
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
        Action a = new Action();
        int arr[] = new int[size + 1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        a.display(arr, size);
        System.out.println("Enter the new element: ");
        int new_element = in.nextInt();
        System.out.println("Enter the new element's position: ");
        int pos = in.nextInt();

        for(int i = size; i >= pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = new_element;
        a.display(arr, size+1);
        in.close();
    }
}
