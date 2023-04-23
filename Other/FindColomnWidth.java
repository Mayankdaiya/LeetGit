public class FindColomnWidth {
    public int[] findColumnWidth(int[][] grid) {
        int ans[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                int e=grid[j][i];
                int t=e;
                if(t<0) t*=-1;
                int len=0;
                if(t!=0) len=(int)Math.log10(t)+1;
                else len=1;
                if(e<0){ 
                    len++;
                }
                ans[i]=Math.max(ans[i],len);
            }
        }
        return ans;
    }
}