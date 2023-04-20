package DynamicProgramming;

class GetMaxInGenArr {
    public int getMaximumGenerated(int n) {
        if(n==0 || n==1) return n;
        int dp[]=new int[n+1];
        dp[0]=0; dp[1]=1;
        int max=0;
        for(int i=2;i<n+1;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
            } else{
                dp[i]=dp[i/2]+dp[(i/2)+1];
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}