class Solution {
    private static final int MOD=1_000_000__007;
    public int numSub(String s) {
        long ans=0;
        long dp=0;
        for(char c:s.toCharArray()){
            if(c=='1')dp=(dp+1)%MOD;
            else dp=0;
            ans=(ans+dp)%MOD;
        }
        return (int)ans;
        
        
    }
}