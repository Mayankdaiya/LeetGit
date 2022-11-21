class Solution {
    public int search(int[] nums, int target) {
        int i=0, j=nums.length-1;
        if(nums.length==0) return -1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int cur=nums[mid];
            if(cur==target) return mid;
            if(nums[i]<=cur){
                if(target>=nums[i] && target<cur) j=mid-1;
                else i=mid+1;
            }
            else{
                if (target>cur && target <= nums[j]) i=mid+1;
                else j=mid-1;
            }
        }
        
        return -1;
    }
}