class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int num:nums){
            String s=Integer.toString(num);
            for(char c:s.toCharArray()){
                l.add(c-'0');

            }
            
        }
        int ans[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;


    }
}