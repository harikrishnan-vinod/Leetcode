package Easy;

public class Sqrt {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while(left <= right)
        {
            final long mid = (left + right)/2;
            if(mid * mid < x)
            {
                left = mid + 1;
            }
            else if(mid * mid > x)
            {
                right = mid - 1;
            }
            else
            {
                return (int)mid;
            }
        }

        return (int)right;
    }
}
