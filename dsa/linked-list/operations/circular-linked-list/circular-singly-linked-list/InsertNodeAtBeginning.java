public class InsertNodeAtBeginning {

    private ListNode last;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;

        }
    }

    public InsertNodeAtBeginning(){
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

  // method to insert node at beginning
    public void insertFirst(int data){
        ListNode temp=new ListNode(data);
        if(last==null){
            last=temp;
        }else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }


    public static void main(String[] args) {
        InsertNodeAtBeginning linkedList=new InsertNodeAtBeginning();
        linkedList.createCircularLinkedList();
        linkedList.display();

        System.out.println("After Inserting node at beginning : ");
        linkedList.insertFirst(1);
        linkedList.display();
    }
}
