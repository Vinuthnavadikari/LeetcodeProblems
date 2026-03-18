class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        //     if(map.get(num)>nums.length/2){
        //         return num;
        //     }
        // }
        // return -1;
        int cnt=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el)cnt1++;
        }
        if(cnt1>(nums.length/2)){
            return el;
        }
        return -1;
    }
}