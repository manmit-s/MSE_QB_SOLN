//Write a Java program to arrange set of n integers in descending order
public class Q_12 {
    static void B_Sort_Descending(int arr[], int size){
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 6 , 8, 12, 69};
        B_Sort_Descending(arr, 5);
        display(arr, 5);
    }
}
