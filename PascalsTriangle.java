import java.util.*;
public class PascalsTriangle {

    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*factorial(x-1);
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int j=i;
            while(j>=0){
                int t=factorial(i)/(factorial(i-j)*factorial(j));
                System.out.print(t+"\t");
                j--;
            }
            System.out.println();
        }
    }
}