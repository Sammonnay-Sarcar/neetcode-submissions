/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tor = head;
        ListNode hare = head;
        while(hare!=null && hare.next!=null){
            tor=tor.next;
            hare=hare.next.next;
            if(tor == hare){
                return true;
            }
        }
        return false;
    }
}
