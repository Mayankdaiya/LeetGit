class ContainsDuplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> m1=new HashMap<>();
        HashMap<Integer, Integer> m2=new HashMap<>();
        int len=nums.length;
        int in=0;
        for(int i=0;i<len;i++){
            if(m2.containsKey(nums[i])){
                m1.put(in++,m2.get(nums[i]));
                continue;
            }
            m2.put(nums[i],i);
        }
        if(m1.isEmpty()) return false;
        int j=0;
        while(!m1.isEmpty()){
            int i=m1.get(j);
            for(int p=i+1;p<len;p++){
                if(nums[i]==nums[p]){
                    int s=p-i;
                    if(s<=k) return true;
                    i=p;
                    p=i;
                }
            }
            m1.remove(j);
            j++;
        }
        return false;
    }
}