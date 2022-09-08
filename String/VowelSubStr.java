import java.util.*;
public class VowelSubStr {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int m=0, ans=0;
        for(int j=0;j<len;j++){
            if(str.charAt(j)=='a' || str.charAt(j)=='e'|| str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u'){
                m++;
                ans=Math.max(ans,m);
            }
            else{
                ans=Math.max(ans,m);
                m=0;
            }
        }
        System.out.println(ans);
    }
}
