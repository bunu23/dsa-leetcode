
public class RemoveLoop {
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

    public void removeLoop() {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                removeLoop(slowPointer);
                return;
            }
        }
    }

    private void removeLoop(ListNode slowPointer) {
        ListNode temp = head;

        while (temp.next != slowPointer.next) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;

    }


    // method to create node where there will be loop
    public void createALoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode six = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = fourth;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        RemoveLoop linkedList = new RemoveLoop();
        linkedList.createALoopInLinkedList();
        linkedList.removeLoop();
        System.out.print("After Removal: ");
        linkedList.display();
    }


}
