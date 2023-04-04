class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0, av=0;
        for(int i=0;i<k;i++){
            av+=arr[i];
        }
        if(av/k>=threshold) res++;
        for(int i=k;i<arr.length;i++){
            av=av-arr[i-k]+arr[i];
            if(av/k>=threshold) res++;
        }
        return res;
    }
}