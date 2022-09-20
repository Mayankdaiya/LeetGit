class SwapNodeInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode n=new ListNode();
        ListNode tmp=n;
        while(head!=null){
            if(head.next!=null){
               ListNode t1=new ListNode(head.val);
                ListNode t2=new ListNode(head.next.val);
            tmp.next=t2;
            tmp.next.next=t1;
            tmp=tmp.next.next;
            head=head.next.next;
            }
            else{
                ListNode t=new ListNode(head.val);
                tmp.next=t;
                head=head.next;
            }
        }
        return n.next;
        
    }
}