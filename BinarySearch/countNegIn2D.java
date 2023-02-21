class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length, n=grid[0].length, sum=0;
        for(int i=0;i<m;i++){
            int in=0, j=n-1;
            while(in<=j){
                int mid=in+(j-in)/2;
                if(grid[i][mid]>=0) in=mid+1;
                else if(grid[i][mid]<0) j=mid-1;
            }
            sum+=n-in;
        }
        return sum;
    }
}