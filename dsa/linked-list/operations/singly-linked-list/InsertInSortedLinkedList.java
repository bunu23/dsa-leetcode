
public class InsertInSortedLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

        public String toString(){
            return data+ " -> null";
        }

    }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current=current.next;

        }
        System.out.println("null");
    }

    // Insert at end (for initial sorted list construction)
    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    // method to insert node in sorted singly linked list
    public ListNode insertSorted(int value){
       ListNode newNode=new ListNode(value);

       ListNode current=head;
       ListNode temp=null;
       while(current!=null && current.data< newNode.data){
           temp=current;
           current=current.next;
       }
       newNode.next=current;
       temp.next=newNode;
       return head;
    }

    public static void main(String[] args) {
InsertInSortedLinkedList list=new InsertInSortedLinkedList();
        // Build an already sorted linked list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(50);
        System.out.print("Sorted Original List: ");
        list.display();

        // inserting new nodes
        System.out.print("After Insertion: ");
        list.insertSorted(60);
        list.insertSorted(40);
        list.display();

    }
}


/*

 // other way
    public void insertSorted(int value) {
        ListNode newNode = new ListNode(value);

        //  Insert at beginning or into empty list
        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse and insert in middle or end
        ListNode current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
*/
