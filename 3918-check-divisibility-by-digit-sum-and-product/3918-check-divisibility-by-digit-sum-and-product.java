class Solution {
    public boolean checkDivisibility(int n) {
        if(n==0){
            return false;
        }
        int a=n;
        int sum=0;
        int product=1;
        while(a>0){
            int digit=a%10;
            sum+=digit;
            product*=digit;
            a=a/10;
        }
        int ans=sum+product;
        return ans!=0 && n%ans==0;
    }
}