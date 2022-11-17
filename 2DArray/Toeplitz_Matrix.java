class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int a=m-1;a>=0;a--){
            int t=a, j=0;
            while((t+1)<m && (j+1)<n){
                if(arr[t][j]!=arr[++t][++j]) return false;
            }
        }
        for(int a=1;a<n;a++){
            int i=0, t=a;
            while((t+1)<n && (i+1)<m){
                if(arr[i][t]!=arr[++i][++t]) return false;
            }
        }
        return true;
    }
}