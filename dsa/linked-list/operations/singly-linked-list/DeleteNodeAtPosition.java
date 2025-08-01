public class DeleteNodeAtPosition {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return data + " -> null";
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("null");
    }

  // method to delete node at given position..output will be the updated list after removing the node
    public void deleteNodeAtPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Invalid position! Position should be greater than zero");
        }

        if (position == 1) {
            head = head.next;

        } else {
            ListNode previous = head;

            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    public static void main(String[] args) {
        DeleteNodeAtPosition linkedList = new DeleteNodeAtPosition();
        linkedList.head = new ListNode(22);
        ListNode second = new ListNode(32);
        ListNode third = new ListNode(98);
        linkedList.head.next = second;
        second.next = third;

        System.out.print("Original List: ");
        linkedList.display();

        linkedList.deleteNodeAtPosition(2);


        System.out.print("updated list: ");
        linkedList.display();
    }


}
