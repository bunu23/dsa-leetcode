public class DetectLoop {
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

    // method to detect loop in singly linked list

    public boolean containsLoop() {

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                return true;
            }

        }
        return false;
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


    public static void main(String[] args) {
        DetectLoop linkedList = new DetectLoop();
        linkedList.createALoopInLinkedList();
        System.out.println(linkedList.containsLoop());

    }


}
