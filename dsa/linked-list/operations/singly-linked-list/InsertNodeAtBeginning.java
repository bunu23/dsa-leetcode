
public class InsertNodeAtBeginning {

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

// method to insert node at the beginning of singly linked list
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;

    }

    public static void main(String[] args) {
        InsertNodeAtBeginning linkedList=new InsertNodeAtBeginning();
        linkedList.insertFirst(22);
        linkedList.insertFirst(32);
        linkedList.insertFirst(12);

        linkedList.display(); // output: 12 -> 32 -> 22 -> null
    }
}
