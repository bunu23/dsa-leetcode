public class ReverseArray {

    public static void reverseArray(int[] numbers, int start, int end) {

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    // Print all elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // move to next line after printing
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8};

        System.out.print("Original array: ");
        printArray(arr);

        reverseArray(arr, 0, arr.length - 1);

        System.out.print("Reversed array: ");
        printArray(arr);
    }
}
