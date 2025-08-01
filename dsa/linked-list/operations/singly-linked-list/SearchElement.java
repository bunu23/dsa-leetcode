public class SearchElement {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return data + "->null";
        }
    }

    // display the linked list
    public void display() {
       ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // method to search for a key in the list.. if found return true else false
    public boolean searchElement(int key){
        ListNode current=head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public static void main(String[] args) {
       SearchElement linkedList=new SearchElement();
        linkedList.head = new ListNode(33);
        linkedList.head.next = new ListNode(44);
        linkedList.display();

        int searchKey=22;
        if(linkedList.searchElement(searchKey)){
            System.out.println("Key "+searchKey + "found in the list");
        }
        else{
            System.out.println("Key "+searchKey+ " not found in the list");
        }


    }

}
