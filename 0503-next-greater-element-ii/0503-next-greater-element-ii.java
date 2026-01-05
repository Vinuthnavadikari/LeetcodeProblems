class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            int idx=i%nums.length;
            while(!s.isEmpty() && s.peek()<=nums[idx]){
                s.pop();
            }
            if(i<nums.length){
                nextGreater[i]=s.isEmpty()?-1:s.peek();
            }
            
            s.push(nums[idx]);
        }
        return nextGreater;
    }
}