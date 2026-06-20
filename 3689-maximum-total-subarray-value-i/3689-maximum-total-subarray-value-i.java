class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=nums[0];
        long max=nums[0];
        for(int num:nums){
            max=Math.max(num,max);
            min=Math.min(num,min);
        }
        return (max-min)*k;
    }
}