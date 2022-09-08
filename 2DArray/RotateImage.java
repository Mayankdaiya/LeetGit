public class RotateImage  {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int j=0;
        for(int i=0;i<m;i++){
            for(int k=j;k<n;k++){
                int t=matrix[i][k];
                matrix[i][k]=matrix[k][i];
                matrix[k][i]=t;
            }
            j++;
        }
        for(int i=0;i<m;i++){
            for(int k=0;k<n/2;k++){
                int t=matrix[i][k];
                matrix[i][k]=matrix[i][n-1-k];
                matrix[i][n-1-k]=t;
            }
        }
    }
}