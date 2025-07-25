/**
 * A basic demonstration of how to declare, initialize,
 * update, and traverse arrays in Java.
 */
public class ArrayUtil {

    /**
     * Prints all elements of the given array.
     */
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to next line after printing
    }

    /**
     * demonstrates array creation, initialization,
     * updating elements, and traversal.
     */
    public void arrayDemo() {
        // Declare and create an array of size 6
        int[] myArray = new int[6];

        // Initialize elements
        myArray[0] = 1;
        myArray[1] = 4;
        myArray[2] = 5;
        myArray[3] = 6;
        myArray[4] = 9;
        myArray[5] = 10;

        // Update value at index 3
        myArray[3] = 8;

        // Print array contents
        System.out.print("myArray: ");
        printArray(myArray);

        // Print array length and last element
        System.out.println("Length of array: " + myArray.length);
        System.out.println("Last element:" + myArray[myArray.length - 1] + "\n");

    }

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        util.arrayDemo();

        // Declare and initialize array using array literal
        int[] arr = {3, 3, 2, 4};
        System.out.print("Printing elements of array 'arr': ");
        util.printArray(arr);

    }
}

/*
output:
myArray: 1 4 5 8 9 10 
Length of array: 6
Last element:10

Printing elements of array 'arr': 3 3 2 4 
*/
