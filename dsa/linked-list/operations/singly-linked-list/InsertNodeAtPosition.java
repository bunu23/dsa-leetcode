
public class InsertNodeAtPosition {
    private ListNode head;

    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }


    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Insert node at given position in singly linked list..assuming position to be valid from 1
    public void insertNodeAtPosition(int value, int position) {
        ListNode node = new ListNode(value);

        if (position < 1) {
            throw new IllegalArgumentException("Position should be >= 1");
        }


        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public static void main(String[] args) {
        InsertNodeAtPosition linkedList = new InsertNodeAtPosition();
        linkedList.insertNodeAtPosition(33, 1);
        linkedList.insertNodeAtPosition(44, 2);
        linkedList.insertNodeAtPosition(54, 2);
        linkedList.display(); // Output: 33 -> 55 -> 44 -> null
    }
}



