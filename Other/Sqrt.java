class Sqrt {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x < 4) return 1;


        long n = 2, m = x/2, mid;
        long square, num = x;
        while(n <= m)
        {
            mid = (n + m)/2;
            square = mid * mid;
            if( square == num )
                return (int)mid;
            else if(num > square)
                n = mid+1;
            else m = mid - 1;
        }
        return (int)m;
    }
}