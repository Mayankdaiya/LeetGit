class Solution {
    public double myPow(double x, int n) {
        // if(n==0 || x==1){
        // return 1;
        // }
        // else if(x==0){
        // return 0;
        // }
        // double p=x, q=n;
        // if(q<0){
        // q=-1*q;
        // p=1/x;
        // }
        // double res=1;
        // while(q>0){
        // res=res*p;
        // q--;
        // }
        // return res;
        if (n == 0) {
            return 1;
        }
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);

    }
}