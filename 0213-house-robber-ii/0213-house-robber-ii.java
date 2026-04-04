class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[]temp1=Arrays.copyOfRange(nums,1,n);
        int[]dp1=new int[n];
        Arrays.fill(dp1,-1);
        int ans1=f(temp1.length-1,temp1,dp1);

        int[]temp2=Arrays.copyOfRange(nums,0,n-1);
        int[]dp2=new int[n];
        Arrays.fill(dp2,-1);
        int ans2=f(temp2.length-1,temp2,dp2);
        return Math.max(ans1,ans2);
    }
    static int f(int ind,int []nums,int []dp){
        if(ind==0)return nums[0];
        if(ind<0)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int pick=nums[ind]+f(ind-2,nums,dp);
        int notPick=f(ind-1,nums,dp);
        return dp[ind]=Math.max(pick,notPick);
    }

}