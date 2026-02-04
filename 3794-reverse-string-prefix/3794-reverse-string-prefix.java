class Solution {
    public String reversePrefix(String s, int k) {
        String first = s.substring(0, k);
        String rest = s.substring(k);

        return new StringBuilder(first).reverse().toString() + rest;
    }
}
