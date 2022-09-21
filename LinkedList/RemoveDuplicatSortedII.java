class RemoveDuplicateSortedII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode main=new ListNode(1);
        ListNode m=main;
        ListNode t1=head;
        ListNode t2=head.next;
        int temp=101;
        while(t2!=null){
            if(t1.val==t2.val){
                temp=t1.val;
            }
            else if(t1.val!=t2.val && temp!=t1.val){
                ListNode t=new ListNode(t1.val);
                m.next=t;
                m=m.next;
            }
            t1=t1.next;
            t2=t2.next;
        }
        if(t1.val!=temp){
            ListNode t=new ListNode(t1.val);
                m.next=t;
        }
        return main.next;
    }
}