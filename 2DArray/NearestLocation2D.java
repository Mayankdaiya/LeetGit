class Solution {
    
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res=Integer.MAX_VALUE;
        int in=0;
        for(int i=0;i<points.length;i++){
            if(points[i][0]!=x && points[i][1]!=y) continue;
            int tx=points[i][0]-x;
            int ty=points[i][1]-y;
            if(tx<0) tx*=-1;
            if(ty<0) ty*=-1;
            int t=tx+ty;
            if(res>Math.min(t,res)){
                res=t;
                in=i;
            }
        }
        if(res==Integer.MAX_VALUE) return -1;
        return in;
    }
}