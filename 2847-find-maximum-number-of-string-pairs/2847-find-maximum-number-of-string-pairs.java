class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            String s=rev(words[i]);
            for(int j=i+1;j<n;j++){
                if(i!=j && s.equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    static String rev(String t){
        String b=new StringBuilder(t).reverse().toString();
        return b;
    }
}