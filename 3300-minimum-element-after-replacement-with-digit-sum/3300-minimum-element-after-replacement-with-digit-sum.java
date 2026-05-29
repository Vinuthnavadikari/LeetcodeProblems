class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            int sum=DigitSum(num);
            min=Math.min(min,sum);
        }
        return min;
    }
    public int DigitSum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}