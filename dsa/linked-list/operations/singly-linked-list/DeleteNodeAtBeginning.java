public class DeleteNodeAtBeginning {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return data + "->null";
        }
    }

    // display the linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // delete node at beginning of the list
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }


    public static void main(String[] args) {
        DeleteNodeAtBeginning linkedList = new DeleteNodeAtBeginning();
        linkedList.head = new ListNode(33);
        linkedList.head.next = new ListNode(44);

        // before deletion
        System.out.println("original list");
        linkedList.display();

        // delete first node
        ListNode deletedNode = linkedList.deleteFirst();
        System.out.println("Deleted Node: " + deletedNode);

        // After deletion
        System.out.println("Updated List");
        linkedList.display();


    }
}
