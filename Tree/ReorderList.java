 class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l1=head;
        ListNode l2=reverse(slow);
        merge(l1,l2);
    }
    public static ListNode reverse(ListNode slow){
        if(slow==null) return null;
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public static void merge(ListNode l1,ListNode l2){
        while(l2!=null){
            ListNode nxt=l1.next;
            l1.next=l2;
            l1=l2;
            l2=nxt;
        }
    }
}