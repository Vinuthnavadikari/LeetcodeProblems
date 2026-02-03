class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4){
            return false;
        }
        int i=0;
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0)return false;
        int j=i;
        while(i+1<n && nums[i]>nums[i+1]){
            i++;
        }
        if(i==j)return false;
        int k=i;
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==k)return false;
        return i==n-1;
        
    }
}