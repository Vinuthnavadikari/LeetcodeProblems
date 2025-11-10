class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int totsum=0,leftsum=0;
        for(int num:nums){
            totsum+=num;
        }
        for(int i=0;i<n;i++){
            int rightsum=totsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}