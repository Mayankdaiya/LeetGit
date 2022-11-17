class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map=new HashMap<>();
       HashMap<Character,Character> m=new HashMap<>();
       for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               if(map.get(s.charAt(i))!=t.charAt(i)) return false;
               continue;
           }
           if(m.containsKey(t.charAt(i))){
               if(m.get(t.charAt(i))!=s.charAt(i)) return false;
               continue;
           }
           m.put(t.charAt(i),s.charAt(i));
           map.put(s.charAt(i),t.charAt(i));
       }
       return true;
    }
}