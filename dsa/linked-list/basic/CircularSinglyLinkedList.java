public class CircularSinglyLinkedList {

    // keeps track of the last node
    private ListNode last; 
    
    // Number of nodes in the list
    private int length; 

    /**
     * Node class represents each element in the list.
     */
    private static class ListNode {
        private int data;       // Data stored in the node
        private ListNode next;  // Reference to the next node

        public ListNode(int data) {
            this.data = data;
        }
    }

    /**
     * Constructor initializes an empty circular singly linked list.
     */
    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    /**
     * Returns the size (number of nodes) of the list.
     */
    public int length() {
        return length;
    }

    /**
     * Checks whether the list is empty.
     */
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     * Creates a sample circular linked list with 4 nodes manually linked.
     * The list will look like: 2 -> 3 -> 4 -> 5 -> back to 2
     */
    public void createCircularLinkedList() {
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        
        // Making the list circular by linking the last node to the first node
        fourth.next = first;
        
        // Updating last pointer to the last node
        last = fourth;
    }

    /**
     * Traverses and displays the circular linked list data starting from
     * the node after last (which is the first node).
     */
    public void display() {
        if (last == null) {
            return; // Empty list, nothing to display
        }

        ListNode first = last.next;  // Start from first node
        while (first != last) {      // Traverse until last node
            System.out.print(first.data + " ");
            first = first.next;
        }
        // Print the last node data
        System.out.println(first.data + " ");
    }

    /**
     * Main method to demonstrate creation and display of the circular singly linked list.
     */
    public static void main(String[] args) {
        CircularSinglyLinkedList linkedList = new CircularSinglyLinkedList();
        linkedList.createCircularLinkedList();
        linkedList.display(); // Output: 2 3 4 5
    }
}
