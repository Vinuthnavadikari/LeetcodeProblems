class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n==0)return 0;
        Arrays.sort(nums);
        int lg=1;
        int lsmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lsmaller){
                count++;
                lsmaller=nums[i];
            }else if(nums[i]!=lsmaller){
                count=1;
                lsmaller=nums[i];
            }
            lg=Math.max(lg,count);
        }
        return lg;
    }

}