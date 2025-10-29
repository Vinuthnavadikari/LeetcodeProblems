class Solution {
    public int reverseDegree(String s) {
        char arr[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           int b=(int)('z'-arr[i]+1);
           sum+=(b*(i+1));
        }
        return sum;
    }
}