class Solution {
    public boolean canAliceWin(int[] nums) {
        int sums=0;
        int sumd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                sums+=nums[i];

            }
            else{
                sumd+=nums[i];
            }
        }
        if(sums==sumd){
            return false;
        }
        if(sums>sumd){
            return true;
        }
        return true;

        

    }
}