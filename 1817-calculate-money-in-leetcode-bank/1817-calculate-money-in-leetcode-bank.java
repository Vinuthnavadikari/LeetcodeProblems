class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int start = 1;
        int dayCount = 0;

        while (dayCount < n) {
           
            for (int i = 0; i < 7 && dayCount < n; i++) {
                total += start + i;
                dayCount++;
            }
            start++; 
        }

        return total;
    }
}
