class Solution {
    
    public boolean checkStraightLine(int[][] coordinates) {
        int s1=coordinates[1][0]-coordinates[0][0];
        int s2=coordinates[1][1]-coordinates[0][1];
        float slope;
        if(s1==0 || s2==0) slope=0;
        else slope=(float)s1/s2;
        System.out.println(slope);
        int in=0;
        for(int i=2;i<coordinates.length;i++){
            int t1=coordinates[i][0]-coordinates[in][0];
            int t2=coordinates[i][1]-coordinates[in][1];
            float t;
            if(t1==0 || t2==0) t=0.0f;
            else t=(float)t1/t2;
            if(t!=slope) return false;
            in=i;
        }
        return true;
    }
}