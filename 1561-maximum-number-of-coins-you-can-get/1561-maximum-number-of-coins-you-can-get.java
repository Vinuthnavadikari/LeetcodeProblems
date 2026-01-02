class Solution {
    public int maxCoins(int[] piles) {
        int a=piles.length;
        int b=a/3;
        Arrays.sort(piles);
        int count=0;
        int c=a-2;
       while(b!=0)
        {
            count+=piles[c];
            c-=2;
            b--;
        }
        return count;
    }
}