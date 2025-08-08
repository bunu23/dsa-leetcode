
public class InsertNodeAtBeginning {
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

    public InsertNodeAtBeginning() {
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

    public void displayBackward() {
        if (tail == null) {
            return;
        }

        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    // method to insert node at beginning

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }


    public static void main(String[] args) {
        InsertNodeAtBeginning linkedList=new InsertNodeAtBeginning();
        linkedList.insertFirst(1);
        linkedList.insertFirst(11);
        linkedList.insertFirst(111);
        linkedList.insertFirst(1111);
        System.out.print("Original List - printing in forward direction : ");
        linkedList.displayForward();
        System.out.print("Original List - printing in backward direction : ");
        linkedList.displayBackward();
    }

}
