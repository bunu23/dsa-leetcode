/*
A basic implementation of a singly linked list in Java.
 * This implementation shows how to:
 * - Create individual nodes manually
 * - Link them together
 * - Traverse and display the list
 *
 */

public class SinglyLinkedList {

    private ListNode head; // head is a instance variable and it is the first node of the list (entry point to the list)

    /*
    inner static class representing a node in the singly linked list
     */
    private static class ListNode {
        private int data; // value stored in the node
        private ListNode next; // reference to the next node


        // constructor initializes the node with a value and sets 'next' to null
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // prints the contents of the linked list from head to null
    public void display() {
        ListNode current = head; // start from the head of the list
        while (current != null) {
            System.out.print(current.data + " -> "); // print the data of the current node followed by arrow
            current = current.next; // move to the next node
        }
        System.out.println("null"); // indicate end of the list
    }

    // main method demonstrating creation and display of the linked list
    public static void main(String[] args) {

        // Create an instance of the SinglyLinkedList
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        // Manually create 4 nodes with data values
        singlyLinkedList.head = new ListNode(10); // head node
        ListNode second = new ListNode(22); // second node
        ListNode third = new ListNode(35); // third node
        ListNode fourth = new ListNode(42); // fourth node (last node)

        // form a chain ,links nodes together
        singlyLinkedList.head.next = second; // 10->22
        second.next = third; // 22->35
        third.next = fourth; // 35->42

        // display the linked list
        singlyLinkedList.display();


    }
}
