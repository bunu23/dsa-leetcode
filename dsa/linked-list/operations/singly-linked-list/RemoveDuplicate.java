
public class RemoveDuplicate {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return Integer.toString(data);
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

    }

    public void insert(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;

    }

    // remove duplicate from sorted singly list

    public void removeDuplicate(){

        if(head==null){
            return;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else {
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {

        RemoveDuplicate linkedList=new RemoveDuplicate();
        linkedList.insert(4);
        linkedList.insert(4);
        linkedList.insert(6);
        linkedList.insert(8);
        System.out.print("Original List : ");
        linkedList.display();

        System.out.print("\nAfter Removing Duplicates : ");
        linkedList.removeDuplicate();
        linkedList.display();



    }
}
