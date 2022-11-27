class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int mn=matrix.length*matrix[0].length;
        int inr=0, inc=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(mn>0){
            for(int i=inc;i<=n && mn>0;i++){
                list.add(matrix[inr][i]);
                mn--;
            }
            inr++;
            for(int i=inr;i<=m && mn>0;i++){
                list.add(matrix[i][n]);
                mn--;
            }
            n--;
            for(int i=n;i>=inc && mn>0;i--){
                list.add(matrix[m][i]);
                mn--;
            }
            m--;
            for(int i=m;i>=inr && mn>0;i--){
                list.add(matrix[i][inc]);
                mn--;
            }
            inc++;
        }
        return list;

    }
}