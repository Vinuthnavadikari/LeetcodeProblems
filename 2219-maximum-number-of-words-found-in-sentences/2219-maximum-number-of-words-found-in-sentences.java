class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String a=sentences[i];
            String ch[]=a.split(" ");
            int c=ch.length;
            max=Math.max(max,c);
        }
        return max;
    }
}