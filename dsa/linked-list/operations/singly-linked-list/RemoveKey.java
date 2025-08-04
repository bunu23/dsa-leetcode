public class RemoveKey {

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

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + " -> ");
            current=current.next;

        }
        System.out.println("null");
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;

    }

    // method to remove the first occurrence of a given key from singly linked list..The method will search for the key and remove only the first node that matches the key value.
    //If the key does not exist in the list, the list should remain unchanged
    public void removeByKey(int key){
        ListNode current=head;
        ListNode temp=null;

        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;

        }
        if(current==null) return ;
        temp.next=current.next;
    }

    public static void main(String[] args) {
        RemoveKey linkedList=new RemoveKey();
        linkedList.insertFirst(3);
        linkedList.insertFirst(6);
        linkedList.insertFirst(6);
        linkedList.insertFirst(9);
        linkedList.insertFirst(10);
        System.out.print("Original List: ");
        linkedList.display();

        System.out.println("List After Removing a given key: ");
        linkedList.removeByKey(6);
        linkedList.display();

    }
}


/*
method to remove all occurrences of a given key from a singly linked list.
the method will traverse the entire list and remove every node whose value matches the key.
it ensures that edge cases (e.g., multiple matches at the head, or no match at all) are handled correctly.


public void removeByKey(int key){

while(head!=null && head.data==key){ head=head.next; }
if(head==null) return;
ListNode current=head;
while(current.next!=null){
if(current.next.data==key){
current.next=current.next.next;
}else{current=current.next;}
}
}
}
 */
