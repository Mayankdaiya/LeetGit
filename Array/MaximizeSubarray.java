import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(k==0) break;
            if(nums[i]<=0){
                nums[i]*=-1;
                if(nums[i]==0) i--;
                k--;
            } 
            else break;
        }
        Arrays.sort(nums);
        int s=0, in=0;
        while(k>0){
            nums[in]*=-1;
            k--;
            // in++
        }
        for(int i=0;i<nums.length;i++) s+=nums[i];
        return s;
    }
} 