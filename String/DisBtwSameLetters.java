class DisBtwSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        int len=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(s.charAt(i),1);
        }
        for(int i=0;i<len;i++){
            if(!map.containsKey(s.charAt(i))){
                continue;
            }
            int j=i+1, r=0;
            while(j<len && s.charAt(i)!=s.charAt(j)){
                r++;
                j++;
            }
            int a=s.charAt(i)-97;
            if(distance[a]!=r){
                return false;
            }
            map.remove(s.charAt(i));
        }
        return true;
    }
}