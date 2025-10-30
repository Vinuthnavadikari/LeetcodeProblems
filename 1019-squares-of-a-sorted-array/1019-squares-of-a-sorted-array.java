import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add((int)Math.pow(nums[i],2));

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        Arrays.sort(nums);
        return nums;

    }
}