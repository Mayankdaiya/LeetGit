import java.util.*;
public class MurthalParantha {
	public static int time(int arr[],int p){
		int low = 0;
		int high = 10000000;
		int ans = 0;
		while(low <= high){
			int mid = (low + high) / 2;
			if(solve(arr,p,mid)){
				ans  = mid;
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
			
		}
		return ans;
	}

	public static boolean solve(int arr[],int p, int mid){
		int nop = 0;
		for (int i = 0 ;i < arr.length;i++){
			int time = arr[i];
			int j = 2;
			while(time <= mid){
				time += arr[i] * j;
				j++;
				nop++;
			}
			if(nop >= p){
				return true;
			}
		}
		return false;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(time(arr,p));
	}
}