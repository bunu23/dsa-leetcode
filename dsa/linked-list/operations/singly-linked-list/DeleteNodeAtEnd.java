public class DeleteNodeAtEnd {

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

        public String toString(){
            return data+ " -> null ";
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


  // method to delete last node
    public ListNode deleteLastNode(){

       if(head==null || head.next==null){
           return head;
       }

       ListNode current=head;
       ListNode previous=null;


       while(current.next!=null){
           previous=current;
           current=current.next;
       }
       previous.next=null;
       return current;


    }
    public static void main(String[] args) {
        DeleteNodeAtEnd linkedList=new DeleteNodeAtEnd();
        linkedList.head=new ListNode(22);
        linkedList.head.next=new ListNode(12);

        System.out.print("Original List : ");
        linkedList.display();

        System.out.println("Deleted Node : " + linkedList.deleteLastNode());

        System.out.print("Updated List after Deletion: ");
        linkedList.display();
    }


}
