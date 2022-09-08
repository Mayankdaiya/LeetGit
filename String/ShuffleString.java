class ShuffleString {
    public String restoreString(String s, int[] indices) {
        int len=s.length();
        char ch[]=new char[len];
        for(int i=0;i<len;i++){
            ch[indices[i]]=s.charAt(i);
        }
        String str="";
        for(int i=0;i<len;i++){
            str+=ch[i];
        }
        return str;
    }
}