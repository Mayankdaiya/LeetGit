package DynamicProgramming;
import java.util.*;

public class HouseRobber {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return getMaxMoney(nums,0,dp);
    }
    public static int getMaxMoney(int nums[],int i,int dp[]){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int rob=nums[i]+getMaxMoney(nums,i+2,dp);
        int dntrob=getMaxMoney(nums,i+1,dp);
        dp[i]=Math.max(rob,dntrob);
        return Math.max(rob,dntrob);
    }
}