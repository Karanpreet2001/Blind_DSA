package LinkedList;
public class deleteNode {
    
    public static void main(String[] args) {
        
    }

    void delete(ListNode head, int position){

        if(head == null){
            return;
        }

        ListNode temp = head;
        if(position == 0){
            head = temp.next;
            return;
        }


        // node before the node to be deleted.
        for (int i = 0; temp !=null && i < position-1; i++) {
            temp = temp.next;
        }

        // if position is more than number of nodes
        if(temp== null || temp.next==null){
            return;
        }

        ListNode next = temp.next.next;
        temp.next=next;
    }
}
