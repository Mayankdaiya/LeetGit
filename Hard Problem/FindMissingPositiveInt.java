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
}