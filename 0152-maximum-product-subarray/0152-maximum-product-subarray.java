class Solution {
    public int maxProduct(int[] nums) {
        // int res=nums[0];
        // int maxPr=nums[0];
        // int minPr=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     int curr=nums[i];
        //     if(curr<0){
        //         int temp=maxPr;
        //         maxPr=minPr;
        //         minPr=temp;
        //     }
        //     maxPr=Math.max(curr,maxPr*curr);
        //     minPr=Math.min(curr,minPr*curr);
        //     res=Math.max(res,maxPr);
        // }
        // return res;
        int pre=1,suff=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre*=nums[i];
            suff*=nums[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }

}