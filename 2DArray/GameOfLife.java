class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=0;
                if(i-1>=0 && j-1>=0) temp+=board[i-1][j-1];
                if(i-1>=0) temp+=board[i-1][j];
                if(i-1>=0 && j+1<n) temp+=board[i-1][j+1];
                if(j+1<n) temp+=board[i][j+1];
                if(i+1<m && j+1<n) temp+=board[i+1][j+1];
                if(i+1<m) temp+=board[i+1][j];
                if(i+1<m && j-1>=0) temp+=board[i+1][j-1];
                if(j-1>=0) temp+=board[i][j-1];
                // conditions
                if(board[i][j]==1){
                    if(temp==2 || temp==3){
                        ans[i][j]=1;
                    }
                }
                else{
                    if(temp==3){
                        ans[i][j]=1;
                    }
                }
            }
            System.out.println();
        } 
        //storing 
        for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    board[i][j]=ans[i][j];
                }
            }
    }
}