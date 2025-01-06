import java.util.Arrays;

public class InsertAtPosition {
    public static void main(String[] args){
        int OriginalArray[] = {2,1,4,5};
        System.out.println("Original Array: " + Arrays.toString(OriginalArray));

        int NewElement = 7;

        int position = 2;

        //validate position
        if(position < 0 || position > OriginalArray.length){
            System.out.println("Invalid Position");
            return;
        }

        // creating new array with one additional size
        int NewArray[] = new int[OriginalArray.length+1];

        // Copy elements before the specified position
        for(int i = 0; i < position; i++){
            NewArray[i] = OriginalArray[i];
        }

        // Insert the new element at the specified position
        NewArray[position] = NewElement;

        // Copy the remaining elements after the position
        for(int i = position; i < OriginalArray.length; i++){
            NewArray[i+1] = OriginalArray[i];
        }

        //print the new array
        System.out.print("New Array: ");
        for(int num:NewArray){
            System.out.print(num + " ");
        }


    }
}
