class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int maxPr=nums[0];
        int minPr=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=maxPr;
                maxPr=minPr;
                minPr=temp;
            }
            maxPr=Math.max(curr,maxPr*curr);
            minPr=Math.min(curr,minPr*curr);
            res=Math.max(res,maxPr);
        }
        return res;
    }
}