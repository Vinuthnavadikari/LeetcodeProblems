class Solution {
    public int countCommas(int n) {
  int a=(int)Math.log10(n)+1;
       
        if(a<4){
            return 0;
        }
        return n-1000+1;

        
    }
}