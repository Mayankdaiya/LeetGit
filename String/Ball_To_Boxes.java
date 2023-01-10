class Solution {
    public int[] minOperations(String b) {
        Stack<Integer> st=new Stack<>();
        int arr1[]=new int[b.length()];
        int arr2[]=new int[b.length()];
        int s=0;
        for(int i=0;i<b.length();i++){
            if(!st.isEmpty()){
                if(b.charAt(i)=='1'){
                    s+=(i-st.peek())*st.size();
                    arr1[i]=s;
                }
                else{
                    arr1[i]=s+(i-st.peek())*st.size();
                    continue;
                }
            }
            if(b.charAt(i)=='1') st.push(i);
        }
        st.clear(); s=0;
        for(int i=b.length()-1;i>=0;i--){
            if(!st.isEmpty()){
                if(b.charAt(i)=='1'){
                    s+=(st.peek()-i)*st.size();
                    arr2[i]=s;
                }
                else{
                    arr2[i]=s+(st.peek()-i)*st.size();
                    continue;
                }
            }
            if(b.charAt(i)=='1') st.push(i);
        }
        for(int i=0;i<b.length();i++) arr1[i]+=arr2[i];
        return arr1;
    }
}