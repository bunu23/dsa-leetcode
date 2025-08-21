import java.util.EmptyStackException;

/**
 * LinkedList-based stack implementation.
 * Dynamic size, suitable for frequent push/pop operations.
 */

public class LinkedStack<T> implements Stack<T>{

    private ListNode<T> top;
    private int size;

    private static class ListNode<T>{

        private T data;
        private ListNode<T> next;

        public ListNode(T data){
            this.data=data;
        }
    }


    @Override
    public void push(T data) {
        ListNode<T> newNode=new ListNode<>(data);
        newNode.next=top;
        top=newNode;
        size++;
    }

    @Override
    public T pop() {
       if(isEmpty()) throw new EmptyStackException();
       T value=top.data;
       top=top.next;
       size--;
       return value;
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

}
