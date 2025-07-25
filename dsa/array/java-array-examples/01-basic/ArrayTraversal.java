public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Traversing with a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Traversing with an enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

/*
output: 
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50

Using enhanced for-loop:
10 20 30 40 50 
*/
