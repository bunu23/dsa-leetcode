import java.util.Arrays;

public class RemoveEvenNumbers {

    // method to remove even integers from array
    public static int[] removeEven(int[] numbers) {
        // count the odd numbers
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }

        // create new array to hold odd numbers
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[index] = numbers[i];
                index++;
            }


        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 7, 9, 20, 13, 16, 5};
        int[] filtered=removeEven(arr);

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("Array after removing even numbers: ");
        for(int num:filtered){
            System.out.print(num+" ");
        }
    }
}
