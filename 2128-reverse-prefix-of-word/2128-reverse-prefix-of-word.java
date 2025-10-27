class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        String v=word.substring(0,n+1);
        String s=new StringBuilder(v).reverse().toString();
        return s+word.substring(n+1,word.length());

    }
}