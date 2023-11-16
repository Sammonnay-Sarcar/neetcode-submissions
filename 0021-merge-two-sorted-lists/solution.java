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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            
            if(list1.val < list2.val){
                ListNode temp = new ListNode();
                temp.val = list1.val;
                temp.next = null;
                tail.next = temp;
                tail = tail.next;
                list1 = list1.next;
            }else if(list1.val > list2.val){
                ListNode temp = new ListNode();
                temp.val = list2.val;
                temp.next = null;
                tail.next = temp;
                tail = tail.next;
                list2 = list2.next;
            }else if(list1.val == list2.val){
                ListNode temp = new ListNode();
                temp.val = list1.val;
                temp.next = null;
                tail.next = temp;
                tail = tail.next;
                list1 = list1.next;
                ListNode temp1 = new ListNode();
                temp1.val = list2.val;
                temp1.next = null;
                tail.next = temp1;
                tail = tail.next;
                list2 = list2.next;
            }
        }
        while(list1!=null){
                ListNode temp = new ListNode();
                temp.val = list1.val;
                temp.next = null;
                tail.next = temp;
                tail = tail.next;
                list1 = list1.next;
        }
        while(list2!=null){
                ListNode temp = new ListNode();
                temp.val = list2.val;
                temp.next = null;
                tail.next = temp;
                tail = tail.next;
                list2 = list2.next;
        }
        ListNode res = dummy;
        return res.next;
    }
}
