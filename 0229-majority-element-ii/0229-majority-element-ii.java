class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        int mini=(int)(n/3)+1;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==mini){
                l.add(nums[i]);
            }
            if(l.size()==2)break;
        }
        return l;
    }
}