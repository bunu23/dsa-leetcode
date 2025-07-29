/**
 * SinglyLinkedListLength demonstrates a singly linked list implementation
 * with a method to find the length (number of nodes) in the list.
 */
public class SinglyLinkedListLength {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * findLength traverses the linked list starting from head
     * and counts the number of nodes until it reaches null.
     * @return the length (number of nodes) in the list
     */
    public int findLength() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedListLength singlyLinkedListLength = new SinglyLinkedListLength();
        singlyLinkedListLength.head = new ListNode(11);
        ListNode second = new ListNode(13);
        ListNode third = new ListNode(16);
        ListNode fourth = new ListNode(17);

        singlyLinkedListLength.head.next = second;
        second.next = third;
        third.next = fourth;

        singlyLinkedListLength.findLength();
        System.out.println("Length is " + singlyLinkedListLength.findLength());

    }

}
