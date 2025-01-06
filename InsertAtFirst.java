import java.util.Arrays;

public class InsertAtFirst {
    public static void main(String[] args){
        // original array
        int OriginalArray[] = {3,5,6,4,2};
        System.out.println("Original Array: " + Arrays.toString(OriginalArray));

        //Element to insert
        int newElement = 9;

        // creating new array with one additional size
        int newArray[] = new int[OriginalArray.length+1];

        //insert the new element at first
        newArray[0] = newElement;

        //copy the Original array elements to the new array
        for(int i = 0; i < OriginalArray.length; i++){
            newArray[i+1] = OriginalArray[i];
        }

        //Print new array
        System.out.print("New array: ");
        for(int num: newArray){
            System.out.print(num + " ");
        }
    }
}
