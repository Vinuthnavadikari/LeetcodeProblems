class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i=0,j=nums.size()-1;
        int count=0;
        while(i<j){
            if(nums.get(i)+nums.get(j)<target){
            count+=(j-i);
            i++;
           }
           else{
            j--;
        }
        }
        return count;
        //   int count = 0;
        // int i = 0;

        // while (i < nums.size()) {
        //     int j = i + 1;
        //     while (j < nums.size()) {
        //         if (nums.get(i) + nums.get(j) < target) {
        //             count++;
        //         }
        //         j++;
        //     }
        //     i++;
        // }

        // return count;
    }
    }
