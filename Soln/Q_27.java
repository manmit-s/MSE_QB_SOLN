//Write a Java program to find largest and second largest for set of n integers
public class Q_27 {
    public static void main(String[] args) {
        int arr[] = {6, 12, 69, 102, 4, 1, 3}, largest, s_largest = 0;
        largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                s_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > s_largest && arr[i] != largest){
                s_largest = arr[i];
            }
        }
        System.out.println("Largest element = " + largest);
        System.out.println("Second Largest element = " + s_largest);
    }
}
