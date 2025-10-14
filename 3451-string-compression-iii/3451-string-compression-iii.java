class Solution {
    public String compressedString(String word) {
      StringBuilder sb = new StringBuilder();
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            int count = 1;
            
            
            while (i < n - 1 && word.charAt(i) == word.charAt(i + 1)) {
                count++;
                i++;
            }
            
           
            while (count > 9) {
                sb.append(9).append(c);
                count -= 9;
            }
            
            sb.append(count).append(c);
        }
        
        return sb.toString();
    }
}