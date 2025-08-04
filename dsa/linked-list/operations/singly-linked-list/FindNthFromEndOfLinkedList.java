
public class FindNthFromEndOfLinkedList {

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

    // method to find nth node from end of linked list

    public ListNode findNthFromEnd(int n){

        ListNode mainPointer=head;
        ListNode referencePointer=head;
        int count=0;

        while(count<n){
            if(referencePointer==null){
                throw new IllegalArgumentException(n + "is greater than number of nodes in the list");
            }
            referencePointer=referencePointer.next;
            count++;
        }

        while(referencePointer!=null){
            referencePointer=referencePointer.next;
            mainPointer=mainPointer.next;
        }
        return mainPointer;

    }

    public static void main(String[] args) {
        FindNthFromEndOfLinkedList linkedList=new FindNthFromEndOfLinkedList();
        linkedList.insert(33);
        linkedList.insert(44);
        linkedList.insert(55);
        linkedList.insert(66);
        System.out.print("Original List : ");
        linkedList.display();

        ListNode nthNode=linkedList.findNthFromEnd(3);
        System.out.println("Third node from the end is: "+ nthNode);


    }
}
