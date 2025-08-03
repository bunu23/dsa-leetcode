public class ReverseLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

        public String toString(){
            return data + " -> null ";
        }
    }


    // method to reverse linked list
    public void reverse(){

        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;

        while(current!=null){

            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;

    }

    // method to insert node in linked list

    public void insertNode(int value){
       ListNode newNode=new ListNode(value);
       newNode.next=head;
       head=newNode;
    }


    // to display

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current=current.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList=new ReverseLinkedList();
        linkedList.insertNode(33);
        linkedList.insertNode(35);
        linkedList.insertNode(55);
        System.out.print("Original list: ");
        linkedList.display();

        System.out.print("Reversed List");
        linkedList.reverse();
        linkedList.display();


    }
}
