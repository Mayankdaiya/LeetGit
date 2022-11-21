class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int curr=nums[mid];
            if(i==mid || j==mid){
                if(nums[i]<=nums[j]) return nums[i];
                else return nums[j];
            }
            if(nums[i]<=nums[j]){
                if(nums[i]<=curr){
                    return nums[i];
                }
                else i=mid;
            }
            else{
                if(nums[j]<curr){
                    i=mid+1;
                }
                else j=mid;
            }
        }
        return -1;
    }
}