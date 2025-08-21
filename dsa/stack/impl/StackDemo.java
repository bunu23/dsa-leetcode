public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new LinkedStack<>(); // Can switch to ArrayStack<>()
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek()); // 30
        stack.pop();
        System.out.println("Top after pop: " + stack.peek()); // 20
        System.out.println("Stack size: " + stack.size());   // 2

        // Switch to ArrayStack easily
        stack = new ArrayStack<>(10);
        stack.push(100);
        stack.push(200);
        System.out.println("Top of ArrayStack: " + stack.peek()); // 200
    }
}
