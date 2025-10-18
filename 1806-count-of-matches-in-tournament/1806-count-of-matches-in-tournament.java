class Solution {
    public int numberOfMatches(int n) {
        int total = 0;
        while (n > 1) {
            int matches = n / 2;
            total += matches;
            n = n - matches;
        }
        return total;
    }
}
