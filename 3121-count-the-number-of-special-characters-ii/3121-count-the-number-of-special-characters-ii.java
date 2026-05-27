class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lowerLast = new int[26];
        int[] upperFirst = new int[26];

        Arrays.fill(lowerLast, -1);
        Arrays.fill(upperFirst, -1);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isLowerCase(c)) {
                lowerLast[c - 'a'] = i;
            } else {
                int idx = c - 'A';

                if (upperFirst[idx] == -1) {
                    upperFirst[idx] = i;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (lowerLast[i] != -1 &&
                upperFirst[i] != -1 &&
                lowerLast[i] < upperFirst[i]) {

                count++;
            }
        }

        return count;
    }
}