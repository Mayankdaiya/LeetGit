class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max) max=arr1[i];
        }
        int arr[]=new int[max+1];
        for(int i=0;i<arr1.length;i++) arr[arr1[i]]++;
        int res[]=new int[arr1.length];
        int t=0;
        for(int i=0;i<arr2.length;i++){
            while(arr[arr2[i]]-->0) res[t++]=arr2[i];
        }
        for(int i=0;i<arr.length;i++){
            while(arr[i]-->0) res[t++]=i;
        }
        return res;
    }
}