class Solution {
    public int getLucky(String s, int k) {
        StringBuilder c=new StringBuilder();
        for(char a:s.toCharArray()){
            c.append(a-'a'+1);
        }
        String d=c.toString();
        int result = 0;

        while (k-- > 0) {
            result = 0;
            for (char ch : d.toCharArray()) {
                result += ch - '0'; 
            }
            d = String.valueOf(result); 
        }
        return result;

    }
}