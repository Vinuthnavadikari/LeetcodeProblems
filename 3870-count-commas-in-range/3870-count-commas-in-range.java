class Solution {
    public int countCommas(int n) {
        int digit=0;
        int a=n;
        while(n>0){
            digit++;
            n/=10;
        }
        if(digit<4){
            return 0;
        }
        return a-1000+1;

        
    }
}