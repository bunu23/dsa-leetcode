import java.util.NoSuchElementException;

public class DeleteFirstNode {
    private ListNode last;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;

        }
    }

    public DeleteFirstNode(){
        last=null;
        length=0;
    }

    public int length(){
        return length;

    }

    public boolean isEmpty(){
        return length==0;
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

    // method to remove first node in circular singly linked list
    public ListNode removeFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=last.next;
        if(last.next==last){
            last=null;
        }else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        DeleteFirstNode linkedList=new DeleteFirstNode();
        linkedList.insertFirst(33);
        linkedList.insertFirst(22);
        linkedList.display();


        System.out.println("After Removing the First Node: ");
        linkedList.removeFirstNode();
        linkedList.display();

    }
}
