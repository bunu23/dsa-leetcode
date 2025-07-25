/**
 * Program to find the minimum value in an integer array.
 */
public class FindMinimumValue {

    //Finds and returns the minimum value from the given array.

    public int findMinimum(int[] array) {
        int min = array[0]; // assume first element is minimum

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // update min if a smaller value is found
            }
        }

        return min;
    }

    // print the array elements
    public void printArray(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        FindMinimumValue minimumFinder = new FindMinimumValue();

        int[] array = {3, 5, 2, 6, 7, 1};

        minimumFinder.printArray(array); // print original array
        int minValue = minimumFinder.findMinimum(array); // find minimum
        System.out.println("Minimum value in array: " + minValue);
    }
}
