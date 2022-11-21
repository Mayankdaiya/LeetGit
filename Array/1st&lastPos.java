class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(arr[0]==-1 && nums[i]==target){
                arr[0]=i;
                arr[1]=i;
            }
            else if(nums[i]==target) arr[1]=i;
        }
        return arr;
    }
}