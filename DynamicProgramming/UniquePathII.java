package DynamicProgramming;

public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1) return 0;
        int path[][]=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) path[i][j]=1;
                else if(i==m-1 && obstacleGrid[i][j]!=1){
                    if(j+1<n) path[i][j]=path[i][j+1];
                } else if(j==n-1 && obstacleGrid[i][j]!=1){
                    if(i+1<m) path[i][j]=path[i+1][j];
                } else if(i!=m-1 && j!=n-1 && obstacleGrid[i][j]!=1){
                    path[i][j]=path[i][j+1]+path[i+1][j];
                }
            }
        }
        return path[0][0];
    }
}