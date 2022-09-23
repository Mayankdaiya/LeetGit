class ReverseWords {
    public String reverseWords(String s) {
        int len=s.length();
        String str="";
        int in=0, a=0;
        for(int i=0;i<len;i++){
            if(i==(len-1) && s.charAt(i)!=' '){
                if(a==0){
                    str=s.substring(in,i+1)+str;
                }
                else{
                    str=s.substring(in,i+1)+" "+str;
                }

                break;
            }
            else if(s.charAt(i)!=' ' && s.charAt(i+1)==' '){
                if(a==0){
                    str=s.substring(in,i+1)+str;
                    a=1;
                }
                else{
                    str=s.substring(in,i+1)+" "+str;
                }
                in=i;
            }
            if((i+1)<len && s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                in=i+1;
            }

        }
        return str;
    }
}