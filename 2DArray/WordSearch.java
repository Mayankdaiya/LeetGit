class Solution {
    public static boolean istrue(char[][] arr,String w,int i,int j){
        if(w.length()==0) return true;
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!=w.charAt(0)) return false;
        w=w.substring(1,w.length());
        char cur=arr[i][j];
        arr[i][j]='0';
        boolean a=istrue(arr,w,i+1,j);
        boolean b=istrue(arr,w,i-1,j);
        boolean c=istrue(arr,w,i,j+1);
        boolean d=istrue(arr,w,i,j-1);
        arr[i][j]=cur;
        return (a||b||c||d);
    }

    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int a=0, b=0;
        for(int i=0;i<m*n;i++){
            if(i!=0 && i%n==0) a++;
            if(board[a][i%n]==word.charAt(0)){
                if(istrue(board,word,a,i%n)) return true;
            }

        }
        return false;
        // istrue(board,word,0,0);
    }
}