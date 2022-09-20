import java.util.*;
class Add2Num {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n=new ListNode();
        ListNode tmp=n;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int nn=0;
           if(l1!=null){
               nn+=l1.val;
               l1=l1.next;
           }
           if(l2!=null){
               nn+=l2.val;
               l2=l2.next;
           }
           nn+=carry;
           carry=nn/10;
            ListNode t=new ListNode(nn%10);
            tmp.next=t;
            tmp=tmp.next;
        }
        return n.next;
    }
}