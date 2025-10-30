class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i+=2){
            int a=nums[i];
            int b=nums[i+1];
            arr[i]=b;
            arr[i+1]=a;
        }
        return arr;
    }
}