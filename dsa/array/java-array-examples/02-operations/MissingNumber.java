public class MissingNumber {

    // Method to find the missing number from an array containing numbers from 1 to n (with one missing)
    public int findMissingNumber(int[] inputArray) {
        int totalCount = inputArray.length + 1; // n = length + 1, since one number is missing
        int expectedSum = totalCount * (totalCount + 1) / 2;

        int actualSum = 0;
        for (int number : inputArray) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    // Main method to test the missing number logic
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6, 7}; // Missing number is 3

        MissingNumber finder = new MissingNumber();
        int missingNumber = finder.findMissingNumber(numbers);

        System.out.println("The missing number is: " + missingNumber);
    }
}
