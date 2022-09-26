class House_Robber {
    public int rob(int[] nums) {
        int prevMax = 0;
        int currentMax = 0;

        for(int num : nums) {
            int sum = prevMax + num;
            prevMax = currentMax;
            currentMax = Math.max(sum, currentMax);
        }
        return currentMax;
    }
}