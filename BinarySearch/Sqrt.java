package BinarySearch;

class Solution {
    public int mySqrt(int x) {
        if(x>0 && x<=3) return 1;
        int i=0, j=x, mid=0;
        while(i<=j){
            mid=i+(j-i)/2;
            if(mid>46340 || mid*mid>x){
                j=mid-1;
            }
            else if(mid*mid<x){
                i=mid+1;
            }
            else return mid;
        }
        return i-1;
    }
    
}