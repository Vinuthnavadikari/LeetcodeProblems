class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int totsum=0,leftsum=0;
        int[]ans=new int[n];
        for(int num:nums)totsum+=num;
        for(int i=0;i<n;i++){
            int rightsum=totsum-leftsum-nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return ans;

    }
}