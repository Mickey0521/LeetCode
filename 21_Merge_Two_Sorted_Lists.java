/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode a = l1; // the head of 1st list
        ListNode b = l2; // the head of 2nd list
        
        // note: we create a "dummy node" 
        // to be the "previous node" of the head of the new list
        // to avoid some potential bugs (and to keep the 1st node)
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        
        // some special cases
        if(a == null && b == null)
            return null;
        else if(a == null)
            return b;
        else if(b == null)
            return a;
        
        // process the nodes of both lists (until one node becomes "null")
        while(a != null && b != null){
            
            // case 1: a is smaller than b
            if(a.val <= b.val){
                current.next = a;
                a = a.next;
                current = current.next;
            }
            // case 2: b is smaller than a
            else{
                current.next = b;
                b = b.next;
                current = current.next;
            }
        }
        
        // the remaining nodes
        if(a == null){
            current.next = b;
        }
        if(b == null){
            current.next = a;
        }
        
        return dummy.next; // note: dummy.next is the "1st" node
    }
}
