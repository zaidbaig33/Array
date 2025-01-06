import java.util.Arrays;

public class InsertAtEnd {
    public static void main(String[] args){
        int OriginalArray[] = {1,2,3,4,5};

        System.out.println("Original Array: " + Arrays.toString(OriginalArray));

       //Element to insert
       int NewElement = 9;

       // creating new array with one additional size
       int NewArray[] = new int[OriginalArray.length+1];

       //copy the Original array elements to the new array
       for(int i = 0; i < OriginalArray.length; i++){
           NewArray[i] = OriginalArray[i];
       }

       // Insert the New Element at the Last Index
       NewArray[NewArray.length-1] = NewElement;

        //Print new array
        System.out.println("New Array: " + Arrays.toString(NewArray));
    }
}
