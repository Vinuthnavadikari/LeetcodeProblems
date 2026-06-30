class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=lb(nums,nums.length,target);
        if(l==nums.length || nums[l]!=target)return new int[]{-1,-1};
        return new int[]{l,up(nums,nums.length,target)-1};
        
    }
    private int lb(int nums[],int n,int x){
        int l=0,h=n-1;
        int ans=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>=x){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    private int up(int nums[],int n,int x){
        int l=0,h=n-1;
        int ans=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>x){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return ans;
    }
}