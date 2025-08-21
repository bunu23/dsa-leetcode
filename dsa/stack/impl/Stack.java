/**
 * This is a generic Stack interface that can work with any data type
 * <T> is a type of parameter that will be replaced with a real type when stack is used
 */

public interface Stack<T> {

    void push(T data); // push any object of type T
    T pop(); // return object of type T
    T peek(); // return object of type T
    boolean isEmpty(); // check if the stack is empty
    int size(); // returns the number of elements currently in the stack

}
