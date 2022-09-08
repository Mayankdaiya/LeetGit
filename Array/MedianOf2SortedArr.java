class MedianOf2SortedArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int len=len1+len2;
        int arr[]=new int[len];
        int i=0;
        for(i=0;i<len1;i++){
            arr[i]=nums1[i];
        }
        int o=0;
        for(o=0;o<len2;o++){
            arr[i]=nums2[o];
            i++;
        }
        for(int j=0;j<(len-1);j++){
            for(int k=j+1;k<len;k++){
                if(arr[j]>arr[k]){
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }

        int l=len/2;
        double d;
        if(len%2==0){
            d=(double)(arr[l] + arr[l-1])/2;
        }
        else{
            d=arr[l];
        }
        return d;
    }
}