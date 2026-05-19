class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min=Integer.MAX_VALUE;
        Set<Integer>s=new HashSet<>();
        for(int num:nums1){
            s.add(num);

        }
        for(int num:nums2){
            if(s.contains(num)){
                min=Math.min(num,min);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}