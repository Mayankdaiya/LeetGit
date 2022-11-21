class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>nums[i+1] && nums[i]>nums[nums.length-1]) return i;
                else continue;
            }
            else if(i==nums.length-1){
                if(nums[i]>nums[0] && nums[i]>nums[i-1]) return i;
                else continue;
            }
            else if(nums[i]>nums[i+1] && nums[i]>nums[i-1]) return i;
        }
        return 0;
    }
}