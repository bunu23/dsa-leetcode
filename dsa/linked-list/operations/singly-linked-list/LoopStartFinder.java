public class LoopStartFinder {

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

    // method to find the start node of the loop in singly linked list

    public ListNode startNodeInALoop() {

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                return getStartingNode(slowPointer);
            }

        }
        return null;
    }


    private ListNode getStartingNode(ListNode slowPointer){
        ListNode temp=head;
        while(temp!=slowPointer){
            temp=temp.next;
            slowPointer=slowPointer.next;

        }
        return temp; // this temporary node will be the starting node of the loop
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
        LoopStartFinder linkedList=new LoopStartFinder();
        linkedList.createALoopInLinkedList();
        System.out.println(linkedList.startNodeInALoop().data);

    }
}
