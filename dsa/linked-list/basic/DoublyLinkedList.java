
public class DoublyLinkedList {

    // representation of doubly linked list

    private ListNode head;  // Head points to the first node in the list
    private ListNode tail; // Tail points to the last node in the list
    private int length; // return count of number of node

    // Inner static class representing a node in the doubly linked list
    private static class ListNode {
        private int data; // The value stored in the node
        private ListNode previous; // Pointer to the previous node
        private ListNode next; // Pointer to the next node

       // Constructor to create a new node with given data
        public ListNode(int data) {
            this.data = data;

        }
    }
  // Constructor to initialize an empty doubly linked list
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

   // Method to check if the list is empty

    public boolean isEmpty() {
        return length == 0;
    }

      // Method to get the number of nodes in the list
    public int length() {
        return length;
    }

   // Method to print the list from head to tail (forward direction)
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

    // Method to print the list from tail to head (backward direction)
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

      // Method to insert a node at the end of the list
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
    
    
    // Main method to test the doubly linked list
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        // Inserting nodes at the end
        linkedList.insertLast(3);
        linkedList.insertLast(33);
        linkedList.insertLast(55);

        // Displaying the list in forward direction
        System.out.print("Original List - printing in forward direction : ");
        linkedList.displayForward(); // Expected: 3 -> 33 -> 55 -> null

        // Displaying the list in backward direction
        System.out.print("Original List - printing in backward direction : ");
        linkedList.displayBackward(); // Expected: 55 -> 33 -> 3 -> null
    }
}

  
