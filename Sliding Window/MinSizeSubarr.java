public class MinSizeSubarr {
    public int minSubArrayLen(int target, int[] arr) {
        int res=arr.length+1, j=res-1;
        int sum=0, in=0;
        for(int i=0;i<j;i++){
            sum+=arr[i];
            while(sum>target){
                res=Math.min(res,i-in+1);
                sum-=arr[in++];
            }
            if(sum==target){
                res=Math.min(res,i-in+1);
            }
        }
        if(res==arr.length+1) return 0;
        return res; 
    }
}