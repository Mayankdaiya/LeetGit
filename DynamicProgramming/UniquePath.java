package DynamicProgramming;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        int path[][]=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) path[i][j]=1;
                else if(i==m-1){
                    path[i][j]=1;
                } else if(j==n-1){
                    path[i][j]=1;
                    if(i-1>=0) path[i][j]+=path[i-1][j];
                } else{
                    path[i][j]=path[i][j+1]+path[i+1][j];
                }
            }
        }
        return path[0][0];
    }          
}