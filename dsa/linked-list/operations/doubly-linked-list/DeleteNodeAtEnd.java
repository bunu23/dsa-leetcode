import java.util.NoSuchElementException;

public class DeleteNodeAtEnd {

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode previous;

        private ListNode next;

        public ListNode(int data) {
            this.data = data;

        }
    }

    public DeleteNodeAtEnd() {
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void displayForward() {

        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    // delete last node in doubly linked list
  
    public ListNode deleteLast(){

        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=tail;
        if(head==tail){
            head=null;
        }else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }

    public static void main(String[] args) {
        DeleteNodeAtEnd linkedList=new DeleteNodeAtEnd();
        linkedList.insertLast(3);
        linkedList.insertLast(33);
        linkedList.insertLast(55);
        System.out.print("Original List - printing in forward direction : ");
        linkedList.displayForward();

        System.out.print("After deleting last node: ");
        linkedList.deleteLast();
        linkedList.displayForward();

    }

}
