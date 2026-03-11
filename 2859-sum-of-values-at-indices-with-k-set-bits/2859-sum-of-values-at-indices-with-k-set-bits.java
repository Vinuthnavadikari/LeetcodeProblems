class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count=0;
        for(int i=0;i<nums.size();i++)
        {
            if(bitCount(i)==k) count+=nums.get(i);
        }
        return count;
    }
    static int bitCount(int i)
    {
        int count=0;
        while(i>0)
        {
            if((i&1)==1)count++;
            i=i/2;
        }
        return count;
    }
}