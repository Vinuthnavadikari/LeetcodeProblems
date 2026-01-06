class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int s=sum(nums[i]);
            if(s==i){
                return i;
            }
            
           
        }
        return -1;
    }
    public static int sum(int num){
        int sum=0;
        while(num!=0){
            int d=num%10;
            sum+=d;
            num/=10;
        }
        return sum;
    }
}