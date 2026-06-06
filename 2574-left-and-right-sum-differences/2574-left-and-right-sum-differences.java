class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ls=0;
        int ans[]=new int[n];
        int tot=0;
        for(int num:nums){
            tot+=num;

        }
        for(int i=0;i<n;i++){
            int rs=tot-ls-nums[i];
            ans[i]=Math.abs(ls-rs);
            ls+=nums[i];
        }
        return ans;
    }
}