// class Solution {
//     public boolean repeatedSubstringPattern(String s) {

//         int n = s.length();

//         for(int len = 1; len <= n/2; len++){

//             if(n % len != 0) continue;

//             String pattern = s.substring(0, len);
//             Stack<Character> st = new Stack<>();

//             for(char c : s.toCharArray()){
//                 st.push(c);

//                 if(st.size() >= len){
//                     boolean match = true;

//                     for(int i = 0; i < len; i++){
//                         if(st.get(st.size() - len + i) != pattern.charAt(i)){
//                             match = false;
//                             break;
//                         }
//                     }

//                     if(match){
//                         for(int i = 0; i < len; i++){
//                             st.pop();
//                         }
//                     }
//                 }
//             }

//             if(st.isEmpty()){
//                 return true;
//             }
//         }

//         return false;
//     }
// }
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String check = doubled.substring(1, doubled.length() - 1);
        return check.contains(s);
    }
}