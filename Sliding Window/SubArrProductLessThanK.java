class SSubArrProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len=nums.length;
        int ans=0;
        int i=0, prod=1;
        for(int j=0;j<len;j++){
            prod=prod*nums[j];
            while(prod>=k && i<=j){
                prod=prod/nums[i];
                i++;
            }
            ans=ans+j-i+1;
        }
        return ans;
    }
}