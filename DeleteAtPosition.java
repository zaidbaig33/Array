import java.util.Arrays;

public class DeleteAtPosition {
    public static void main(String[] args) {
        int OriginalArray[] = {2, 1, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(OriginalArray));

        int position = 2; // Specify the position to delete

        // Validate position
        if (position < 0 || position >= OriginalArray.length) {
            System.out.println("Invalid Position");
            return;
        }

        // Create a new array with one less size
        int NewArray[] = new int[OriginalArray.length - 1];

        // Copy elements before the specified position
        for (int i = 0; i < position; i++) {
            NewArray[i] = OriginalArray[i];
        }

        // Copy the elements after the specified position
        for (int i = position + 1; i < OriginalArray.length; i++) {
            NewArray[i - 1] = OriginalArray[i];
        }

        // Print the new array
        System.out.print("New Array after deleting element at position " + position + ": ");
        for (int num : NewArray) {
            System.out.print(num + " ");
        }
    }
}
