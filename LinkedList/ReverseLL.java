class ReverseLL {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || (left==right))
            return head;

        ListNode main=head;
        ListNode m=main;
        int i=1;
        while(m!=null && i<(left-1)){
            m=m.next;
            i++;
        }
        ListNode q;
        if(left==1)
            q=m;
        else
            q=m.next;
        ListNode t1=null;
        ListNode t2=null;
        int j=left;
        while(q!=null && j<=right){
            ListNode temp=new ListNode(q.val);
            if(t1==null){
                t1=t2=temp;
                j++;
                q=q.next;
                continue;
            }
            temp.next=t1;
            t1=temp;
            j++;
            q=q.next;
        }
        if(left==1){
            t2.next=q;
            return t1;
        }
        m.next=t1;
        t2.next=q;
        return main;
    }
}