package LinkedList;
//Check wheather the linked list is palindrome or not.


// A->B->B->A
// A->B->C->B->A
public class PalindroneList {
    

    public static void main(String[] args) {
        
        
    }

    ListNode middle(ListNode head){
        ListNode slow= head, fast = head;

        while( fast!=null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    ListNode reverseAList(ListNode head){
        ListNode curr=head, prev=null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    boolean palindroneList(ListNode head){
        if(head == null){
            return true;
        }


        ListNode mid = middle(head);
        ListNode last = reverseAList(mid.next);

        while(last!=null){
            if(head.val != last.val){
                return false;
            }
            head = head.next;
            last = last.next;

        }

        return true;
    }
}
