class  TrappingRainWater{
    public int trap(int[] height) {
        int len=height.length;
        int l[] = new int[len];
		l[0] = height[0];
		for(int i=1;i<len;i++){
			l[i]= Math.max(l[i-1], height[i]);
		}
		int r[] = new int[len];
		r[len-1]= height[len-1];
		for(int i=len-2;i>=0;i--) {
			r[i]= Math.max(r[i+1], height[i]);
		}
		int sum = 0;
		for(int i=0;i<r.length;i++) {
			sum+=Math.min(l[i], r[i]) - height[i];
		}
		return sum;
    }
}