import java.util.Arrays;

public class SortedArray {
    public static void printArray(int arr[]){
        System.out.print("Sorted Array:  ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {5,7,8,4,2};
        System.out.println("Original Array:  " + Arrays.toString(arr));

        for(int i = 0; i< arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
