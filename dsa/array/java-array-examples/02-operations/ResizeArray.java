public class ResizeArray {

    // Resizes the given array to a new capacity and returns the new array
    public static int[] resizeArray(int[] originalArray, int newCapacity) {
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        // Original array with some elements
        int[] originalArray = {1, 2, 3, 4, 5, 2, 5, 6};

        // Set the desired new capacity for the array
        int newCapacity = 10;

        // Resize the original array
        int[] resizedArray = resizeArray(originalArray, newCapacity);

        // Print the elements of the resized array
        System.out.print("Resized array: ");
        for (int element : resizedArray) {
            System.out.print(element + " ");
        }
    }
}
