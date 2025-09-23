class Solution {
    public int maximumProduct(int[] nums) {
        int max=1;
        int n=nums.length;
        Arrays.sort(nums);
        int PrOf3l=nums[n-1]*nums[n-2]*nums[n-3];
        int PrOf2s1l=nums[0]*nums[1]*nums[n-1];
        return Math.max(PrOf3l,PrOf2s1l);
        
        
    }
}