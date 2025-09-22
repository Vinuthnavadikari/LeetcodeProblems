class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n==1)return true;
        // if(n==Math.pow(2,Math.sqrt(n)));
        //  return true;
        // return false; 
        // return (n>0)&& (n&(n-1))==0;
      if(n<=0)return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}