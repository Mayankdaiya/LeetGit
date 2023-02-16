class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map=new HashMap<>();
        int b=0, c=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                b++;
                continue;
            }
            if(map.containsKey(secret.charAt(i))){
                map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
            }
            else map.put(secret.charAt(i),1);
        }
        for(int i=0;i<guess.length();i++){    
            if(guess.charAt(i)!=secret.charAt(i) && map.containsKey(guess.charAt(i))){
                c++;
                if(map.get(guess.charAt(i))>1){
                    map.put(guess.charAt(i),map.get(guess.charAt(i))-1);
                }
                else map.remove(guess.charAt(i));
            }
        }
        String ans=b+"A"+c+"B";
        return ans;
    }
}