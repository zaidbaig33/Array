import java.util.Arrays;

public class DeleteAtFirst {
    public static void main(String[] args) {
        // Original array
        int OriginalArray[] = {3, 5, 6, 4, 2};
        System.out.println("Original Array: " + Arrays.toString(OriginalArray));

        // Check if the array is empty
        if (OriginalArray.length == 0) {
            System.out.println("Array is already empty, nothing to delete.");
            return;
        }

        // Create a new array with one less size
        int newArray[] = new int[OriginalArray.length - 1];

        // Copy the elements from OriginalArray to newArray, skipping the first element
        for (int i = 1; i < OriginalArray.length; i++) {
            newArray[i - 1] = OriginalArray[i];
        }

        // Print the new array
        System.out.print("New array after deleting the first element: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
