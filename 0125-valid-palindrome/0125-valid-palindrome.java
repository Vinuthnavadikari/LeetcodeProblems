// class Solution {
//     public boolean isPalindrome(String s) {
//         s=s.trim().toLowerCase().replaceAll("[^a-z0-9]","");
//         char c[]=s.toCharArray();
//         StringBuilder sb=new StringBuilder();
//         for(char r:c){
//             sb.append(r);
//         }
//         String res=sb.reverse().toString();
//        return res.equals(s);

//     }
// }
class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}