package LinkedList;

import java.util.LinkedList;

class Solution {

    public int[] nextLargerNodes(LinkedList head) {
        LinkedList temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int arr[]=new int[len], i=0;
        temp=head;
        while(temp!=null){
            LinkedList dummy=temp.next;
            int f=0;
            while(dummy!=null){
                if(dummy.val>temp.val){
                    f=1;
                    arr[i++]=dummy.val;
                    break;
                }
                dummy=dummy.next;
            }
            if(f==0){
                i++;
            }
            temp=temp.next;
        }
        return arr;

    }
}