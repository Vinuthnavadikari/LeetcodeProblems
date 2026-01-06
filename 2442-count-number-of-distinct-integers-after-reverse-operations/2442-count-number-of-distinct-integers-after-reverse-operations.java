class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int rev=0;
            while(nums[i]!=0){
                int digit=nums[i]%10;
                rev=rev*10+digit;
                nums[i]/=10;
            }
            a.add(rev);
        }
        
        HashSet<Integer> s=new HashSet<>();
        for(int arr:a){
            if(!s.contains(arr)){
                s.add(arr);
            }
        }
        return s.size();
    }
}