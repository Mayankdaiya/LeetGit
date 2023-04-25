package DynamicProgramming;

import java.util.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int t1=getMaxMoney(nums,0,nums.length-1,dp);
        Arrays.fill(dp,-1);
        int t2=getMaxMoney(nums,1,nums.length,dp);
        return Math.max(t1,t2);
    }
    public static int getMaxMoney(int nums[],int i,int n,int dp[]){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int rob=nums[i]+getMaxMoney(nums,i+2,n,dp);
        int dntrob=getMaxMoney(nums,i+1,n,dp);
        dp[i]=Math.max(rob,dntrob);
        return Math.max(rob,dntrob);
    }
}