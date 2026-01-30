class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }
        int ans1=0;
        int ans2=0;
        for(int num:nums1){
            if(s2.contains(num)){
                ans1++;
            }
        }
         for(int num:nums2){
            if(s1.contains(num)){
                ans2++;
            }
        }
        return new int[]{ans1,ans2};



    }
}