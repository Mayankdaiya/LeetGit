import java.util.HashMap;

public class FindMissingPositiveInt {
    public int firstMissingPositive(int[] nums) {
       HashMap<Integer,Boolean> map=new HashMap<>();
       for(int i=1;i<=nums.length;i=i+1){
           map.put(i,true);
       }
       for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
              map.put(nums[i],false);
           }
       }
       for(int i=1;i<=nums.length;i++){
           if(map.get(i)) return i;
       }
      return nums.length+1;
    }
    public int firstMissingPositive_optimal(int[] nums) {
        int i=0;
        while(i<nums.length){
            int Indexed_pos=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[Indexed_pos]){
                int temp=nums[i];
                nums[i]=nums[Indexed_pos];
                nums[Indexed_pos]=temp;
            } else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return nums.length+1;
     }
}