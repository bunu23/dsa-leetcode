public class InsertNodeAtEnd {

    private ListNode last;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;

        }
    }

    public InsertNodeAtEnd(){
        last=null;
        length=0;
    }

    public int length(){
        return length;

    }

    public boolean isEmpty(){
        return length==0;
    }

    public void createCircularLinkedList(){
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(4);
        ListNode third=new ListNode(5);
        first.next=second;
        second.next=third;
        third.next=first;
        last=third;
    }


    public void display(){
        if(last==null){
            return;
        }

        ListNode first=last.next;
        while(first!=last){
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.println(first.data+" ");

    }

  // insert node at end of circular singly linked list
    public void insertLast(int data){
        ListNode temp=new ListNode(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }


    public static void main(String[] args) {
        InsertNodeAtEnd linkedList=new InsertNodeAtEnd();
        linkedList.createCircularLinkedList();
        linkedList.display();
        System.out.println("After inserting node at end: ");
        linkedList.insertLast(9);
        linkedList.display();
    }
}
