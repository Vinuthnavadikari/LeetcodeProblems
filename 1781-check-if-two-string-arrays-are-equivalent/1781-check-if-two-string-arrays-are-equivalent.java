class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String s1="",s2="";
        // for(int i=0;i<word1.length;i++){
        //     s1+=word1[i];
        // }
        // for(int i=0;i<word2.length;i++){
        //     s2+=word2[i];
        // }
        // return s1.equals(s2);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String w : word1) {
            s1.append(w);
        }
        for (String w : word2) {
            s2.append(w);
        }

        return s1.toString().equals(s2.toString());
    }
}