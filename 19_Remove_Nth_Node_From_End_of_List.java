/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // see the figure in the solution!
        /*
        we will add an auxiliary "dummy" node, which points to the list head. 
        The "dummy" node is used to simplify some corner cases 
        such as a list with only one node, or removing the head of the list!!!
        */
        
        // Remove the (L−n+1)th node from the beginning in the list , 
        // where L is the list length.
        // This problem is easy to solve once we found list length L.
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head; // starts from the "head" to count the length of the list
        
        int L =0; 
        while(current != null){
            L++;
            current = current.next;
        }
        
        current = dummy; // starts from the "dummy", so we can remove the "head" (without extra error) 
        int node_number =1; // the node number (that we want to remove)
        
        while(node_number != L-n+1){
            current = current.next;
            node_number++;
        }
        
        //if(current.next != null)
            current.next = current.next.next; // remove the node 
        
        return dummy.next;
    }
}
