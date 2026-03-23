class Solution {
    public int countCommas(int n) {
   String a=String.valueOf(n);
   int digit=a.length();
       
        if(digit<4){
            return 0;
        }
        return n-1000+1;

        
    }
}