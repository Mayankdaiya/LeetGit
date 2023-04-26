package DynamicProgramming;

public class MinCostToClimbStairs {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        return minNoOfSteps(cost,0,dp);
    }
    public static int minNoOfSteps(int cost[],int i,int dp[]){
        if(i>=cost.length-1){
            return 0;
        }
        if(dp[i]!=0) return dp[i];
        int c1=cost[i]+minNoOfSteps(cost,i+1,dp);
        int c2=cost[i+1]+minNoOfSteps(cost,i+2,dp);
        dp[i]=Math.min(c1,c2);
        return Math.min(c1,c2);
    }
}