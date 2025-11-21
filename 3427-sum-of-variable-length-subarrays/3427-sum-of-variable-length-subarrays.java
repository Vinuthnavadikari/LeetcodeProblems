class Solution {
    public int subarraySum(int[] nums) {
        long pref[]=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            pref[i+1]=pref[i]+nums[i];
            }
            int tot=0;
            for(int i=0;i<nums.length;i++){
                int start=Math.max(0,i-nums[i]);
                tot+=pref[i+1]-pref[start];
            }
            return tot;

        }
    }
