class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>resList=new ArrayList<>();
        backtrack(resList,new ArrayList<>(),nums);
        return resList;
    }
    private void backtrack(List<List<Integer>>resList,ArrayList<Integer>tempList,int[]nums){
        if(tempList.size()==nums.length){
            resList.add(new ArrayList<>(tempList));
            return;
        }
        for(int num:nums){
            if(tempList.contains(num)){
                continue;
            }
            tempList.add(num);
            backtrack(resList,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}