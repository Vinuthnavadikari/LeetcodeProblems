class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minAvg=Double.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            double avg=(nums[i]+nums[n-i-1])/2.0;
            minAvg=Math.min(minAvg,avg);
        }
        return minAvg;

    }
}