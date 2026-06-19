/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return res(head,new int[]{n});
    }
    public ListNode res(ListNode head,int[] n){
        if(head == null){
            return null;
        }
        head.next = res(head.next,n);
        n[0]--;
        if(n[0] == 0){
            return head.next;
        }
        return head;
    }
}
