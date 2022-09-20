class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        if(i==n){
            return head.next;
        }
        int q=i-n;
        temp=head;
        i=1;
        while(i!=q){
            temp=temp.next;
            i++;
        }
        ListNode c=temp.next;
        temp.next=c.next;
        return head;

    }
}