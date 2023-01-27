import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0) list1.add(nums[i]);
            else list2.add(nums[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int ans[]=new int[nums.length];
        int in1=0, in2=list2.size()-1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=list1.get(in1);
                in1++;
            } 
            else{
                ans[i]=list2.get(in2);
                in2--;
            }
        }
        return ans;
    }
}