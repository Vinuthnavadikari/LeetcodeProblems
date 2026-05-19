class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    //     int min=Integer.MAX_VALUE;
    //     Set<Integer>s=new HashSet<>();
    //     for(int num:nums1){
    //         s.add(num);

    //     }
    //     for(int num:nums2){
    //         if(s.contains(num)){
    //             min=Math.min(num,min);
    //         }
    //     }
    //     return min==Integer.MAX_VALUE?-1:min;
    // }
    int i=0,j=0;
    while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            return nums1[i];
        }
        else if((nums1[i]<nums2[j])){
            i++;
        }
        else{
            j++;
        }

    }
    return -1;
}
}