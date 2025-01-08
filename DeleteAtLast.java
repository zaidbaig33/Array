import java.util.Arrays;

public class DeleteAtLast {
    public static void main(String[] args) {
        int OriginalArray[] = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(OriginalArray));

        // Check if the array is empty
        if (OriginalArray.length == 0) {
            System.out.println("Array is empty, nothing to delete.");
            return;
        }

        // Create a new array with one less size
        int NewArray[] = new int[OriginalArray.length - 1];

        // Copy the elements of the Original array to the new array except the last element
        for (int i = 0; i < NewArray.length; i++) {
            NewArray[i] = OriginalArray[i];
        }

        // Print the new array after deleting the last element
        System.out.println("New Array after deleting the last element: " + Arrays.toString(NewArray));
    }
}
