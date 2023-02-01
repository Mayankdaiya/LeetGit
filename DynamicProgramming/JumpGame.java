package DynamicProgramming;

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int arr[]=new int[nums.length];
        int temp=nums[0], idx=1;
        while(temp>0 && idx<nums.length){
            arr[idx]++;
            temp--; idx++;
        }
        for(int i=1;i<nums.length;i++){
            int t=nums[i], in=i+1;
            if(arr[i]==0) continue;
            while(t>0 && in<nums.length){
                arr[in]++;
                t--; in++;
            }
        }
        return arr[nums.length-1]>0;
    }
}