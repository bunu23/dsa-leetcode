
import java.util.NoSuchElementException;

public class DeleteNodeAtBeginning {
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

    public DeleteNodeAtBeginning() {
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

    // delete first node in doubly linked list

    public ListNode deleteFirst(){

        if(isEmpty()){
            throw new NoSuchElementException();
        }

        ListNode temp=head;
        if(head==tail){
            tail=null;
        }else{
            head.next.previous=null;

        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        DeleteNodeAtBeginning linkedList=new DeleteNodeAtBeginning();
        linkedList.insertLast(3);
        linkedList.insertLast(33);
        linkedList.insertLast(55);
        System.out.print("Original List - printing in forward direction : ");
        linkedList.displayForward();

        System.out.print("After deleting first node: ");
        linkedList.deleteFirst();
        linkedList.displayForward();
    }
}
