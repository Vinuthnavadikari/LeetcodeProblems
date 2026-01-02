class Solution {
    public int repeatedNTimes(int[] nums) {
        // int frq[]=new int[10];
        // for(int num:nums){
        //     frq[num]++;
        //     if(frq[num]>1){
        //         return num;
        //     }
        // }
        // return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
        
    }
}