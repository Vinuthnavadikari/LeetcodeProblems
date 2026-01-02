class Solution {
    public int mirrorDistance(int n) {
        return (int)Math.abs(n-reverse(n));
    }
    static int reverse(int n)
    {
        int count=0;
        while(n>0)
        {
            int digit=n%10;
            count=count*10+digit;
            n=n/10;
        }
        return count;
    }
}