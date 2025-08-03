public class MiddleNodeFinder {

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

    public void insert(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current=current.next;

        }
        System.out.println("null");
    }

    // method to find middle node in linked list

    public ListNode getMiddleNode(){
        ListNode slowPointer=head;
        ListNode fastPointer=head;

        while(fastPointer!=null && fastPointer.next!=null){
          slowPointer=slowPointer.next;
          fastPointer=fastPointer.next.next;

        }
        return slowPointer;
    }

    public static void main(String[] args) {
        MiddleNodeFinder linkedList= new MiddleNodeFinder();
        linkedList.insert(1);
        linkedList.insert(21);
        linkedList.insert(12);
        linkedList.insert(98);
        System.out.print("original List: ");
        linkedList.display();
        ListNode middleNode = linkedList.getMiddleNode();
        System.out.print("middle node is : " + middleNode);
    }
}
