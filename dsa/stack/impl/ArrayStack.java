import java.util.EmptyStackException;

/**
 * Array-based stack implementation.
 * Suitable for predictable sizes or when fast access is required.
 */
public class ArrayStack<T> implements Stack<T> {

    private int top;// Index of the top element (-1 if empty)
    private T[] arr;// Array to store stack elements

    /** Constructor to create a stack with given capacity */
    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        top = -1;
        arr = (T[]) new Object[capacity]; // create generic array
    }

    @Override
    public void push(T data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = data;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = arr[top];
        arr[top--] = null; // avoid memory leak
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top];
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return size() == arr.length;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
