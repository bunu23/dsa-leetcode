public class InsertNodeAtEnd {

    private ListNode head;

    private static class ListNode{

        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }


    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+ " -> ");
            current=current.next;
        }
        System.out.println("null");
    }


    // method to insert node at end of singly linked list
    public void insertNodeAtEnd(int value){

        ListNode newNode=new ListNode(value);
        if(head==null){
           head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }

    public static void main(String[] args) {
        InsertNodeAtEnd linkedList=new InsertNodeAtEnd();
        linkedList.insertNodeAtEnd(12);
        linkedList.insertNodeAtEnd(33);
        linkedList.display();
    }
}
