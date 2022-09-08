import java.util.*;
public class DivisibleSubArray {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(GoodSubarr(a));
		}
    }
	public static long GoodSubarr(long[] a){
		long sum=0;
		long fr[]=new long[a.length];
		fr[0]=1;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
			int idx=(int)(sum%a.length);
			if(idx<0){
				idx+=a.length;
			}
			fr[idx]=fr[idx]+1;
		}
		long ans=0;
		for(int i=0;i<fr.length;i++){
			if(fr[i]>=2){
				long p=fr[i];
				ans=ans+(p*(p-1))/2;
			}
		}
		return ans;
	}
}