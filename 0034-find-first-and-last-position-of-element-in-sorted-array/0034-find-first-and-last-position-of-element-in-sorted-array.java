class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=f(nums,nums.length,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        return new int[]{first,l(nums,nums.length,target)};
      
        
    }
    private int f(int[]nums,int n,int x){
        int l=0,h=n-1;
        int first=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==x){
                first=mid;
                h=mid-1;
            }
            else if(nums[mid]<x){
                l=mid+1;
            }
            else{
                h=mid-1;
            }

        }
        return first;

    }
    private int l(int nums[],int n,int x){
        int l=0,h=n-1;
        int last=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==x){
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]<x){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return last;
    }
   
}