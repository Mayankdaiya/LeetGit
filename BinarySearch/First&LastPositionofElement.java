class First&LastPositionofElement {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        if(len==0) return arr;
        if(target<nums[0] || target>nums[len-1]) return arr;
        int i=0, j=len;
        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]>target){
                j=mid-1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                i=mid;
                break;
            }
            
        }
        j=i;
        while(j<len && nums[j]==target){
            j++;
        }
        while(i>=0 && nums[i]==target){
            i--;
        }
        if(nums[i+1]==target && nums[j-1]==target){
            arr[0]=i+1;
            arr[1]=j-1;
        }
        return arr;
    }
}