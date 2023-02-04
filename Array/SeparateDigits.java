import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            int p=(int)Math.pow(10,(int)Math.log10(t));
            while(p>0){
                int tmp=(t/p)%10;
                list.add(tmp);
                p/=10;
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++) ans[i]=list.get(i);
        return ans;
    }
}