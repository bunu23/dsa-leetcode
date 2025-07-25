public class MoveZeroesToEnd {
    // move all zeroes in the array to the end while maintaining the relative order of non-zero elements.

    public static void moveZeroes(int[] arr, int length) {

        int zeroPosition = 0; // points to the position of the next zero to swap
        for (int currentIndex = 0; currentIndex < length; currentIndex++) {
            if (arr[currentIndex] != 0 && arr[zeroPosition] == 0) {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[zeroPosition];
                arr[zeroPosition] = temp;
            }
            // Move zeroPosition forward if it no longer points to zero
            if (arr[zeroPosition] != 0) {
                zeroPosition++;
            }
        }

    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test moveZerosToEnd
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("original array : ");
        printArray(arr);

        moveZeroes(arr, arr.length);
        System.out.println("Array after moving zeroes to end: ");
        printArray(arr);
    }

}
