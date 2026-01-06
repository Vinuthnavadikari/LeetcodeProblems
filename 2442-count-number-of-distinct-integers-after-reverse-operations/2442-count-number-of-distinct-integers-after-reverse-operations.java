// class Solution {
//     public int countDistinctIntegers(int[] nums) {
//         ArrayList<Integer> a=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             a.add(nums[i]);
//         }
//         for(int i=0;i<nums.length;i++){
//             int rev=0;
//             while(nums[i]!=0){
//                 int digit=nums[i]%10;
//                 rev=rev*10+digit;
//                 nums[i]/=10;
//             }
//             a.add(rev);
//         }
        
//         HashSet<Integer> s=new HashSet<>();
//         for(int arr:a){
//             if(!s.contains(arr)){
//                 s.add(arr);
//             }
//         }
//         return s.size();
//     }
// }
// class Solution {
//     public int countDistinctIntegers(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             set.add(num);

//             int rev = 0;
//             int temp = num; 
//             while (temp != 0) {
//                 rev = rev * 10 + (temp % 10);
//                 temp /= 10;
//             }

//             set.add(rev);
//         }

//         return set.size();
//     }
// }
class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int a:nums){
            int re=reverse(a);
            set.add(a);
            set.add(re);
        } 
        return set.size();
    }
    private int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
}