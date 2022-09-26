class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int a1[]=new int[len];
        int p=1;
        for(int i=0;i<len;i++){
            a1[i]=p;
            p*=nums[i];
        }
        p=1;
        for(int i=len-1;i>=0;i--){
            int t=nums[i];
            nums[i]=p*a1[i];
            p*=t;
        }
        return nums;
    }
    
}