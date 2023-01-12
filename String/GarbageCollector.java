public class Solution {
    public int garbageCollection(String[] gb, int[] t) {
        int time=0, m=0, g=0, p=0;
        for(int i=0;i<gb.length;i++){
            String str=gb[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='M'){
                    time++;
                    time+=m;
                    m=0;
                }
                else if(str.charAt(j)=='G'){
                    time++;
                    time+=g;
                    g=0;
                }
                else{
                    time++;
                    time+=p;
                    p=0;
                }
            }
            if(i!=gb.length-1){
                m+=t[i]; g+=t[i]; p+=t[i];
            } 
        }
        return time;
        
    }
} 
