public class Search2Dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        for(int j=0;j<n;j++){
            if(i<m && matrix[i][j]>target){
                i++;
                j=-1;
                continue;
            }
            if(i<m && matrix[i][j]==target){
                return true;
            }
            if(j==n-1 && i<m-1){
                j=-1;
                i++;
            }
        }
        return false;
    }
}