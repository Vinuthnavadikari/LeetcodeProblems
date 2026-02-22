// class Solution {
//     public int countCompleteDayPairs(int[] hours) {
//         int c=0;
//         for(int i=0;i<hours.length;i++){
//             for(int j=i+1;j<hours.length;j++){
//                 if((hours[i]+hours[j])%24==0){
//                     c++;

//                 }

//             }
//         }
//         return c;
//     }
// }
class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int[] freq = new int[24];
        int count = 0;

        for(int h : hours){
            int rem = h % 24;
            int complement = (24 - rem) % 24;

            count += freq[complement];
            freq[rem]++;
        }

        return count;
    }
}