public class SecondMaximum {

    // Method to find the second highest number in an array
    public static int findSecondMaximum(int[] numbers) {

        // Initialize max and secondMax to the smallest possible integer value
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Loop through each number in the array
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            // If current is greater than max, update both max and secondMax
            if (current > max) {
                secondMax = max;
                max = current;
            }
            // If current is between max and secondMax, and not equal to max
            else if (current > secondMax && current != max) {
                secondMax = current;
            }
        }

        // Return the second highest number
        return secondMax;
    }

    public static void main(String[] args) {
        // Define the input array
        int[] inputArray = {2, 3, 5, 7, 4, 2, 3, 8, 8, 5, 7, 44};

        // Call the method and store the result
        int secondMax = findSecondMaximum(inputArray);

        // Print the input array
        System.out.println("Input array:");
        for (int number : inputArray) {
            System.out.print(number + " ");
        }

        // Print the second highest number
        System.out.println("\nSecond highest number: " + secondMax);
    }
}
