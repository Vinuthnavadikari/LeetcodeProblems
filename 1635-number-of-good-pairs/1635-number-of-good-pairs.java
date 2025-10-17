class Solution {
    public int numIdenticalPairs(int[] nums) {
        int a=nums.length;
        int count=0;
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(nums[i]==nums[j])
                count++;
            }
        }
        return count;
    }
}