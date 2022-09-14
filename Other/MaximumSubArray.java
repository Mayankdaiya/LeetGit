class MaximumSubArray {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxSum = nums[0];
        int sum = maxSum;

        for(int i=1;i<n;i++){
            if(sum+nums[i]<=nums[i]){
                sum = nums[i];
            }else{
                sum+=nums[i];
            }
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;

    }
}