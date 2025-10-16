class Solution {
    public int balancedStringSplit(String s) {
        int rcount=0;
        int lcount=0;
        int count=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='R'){
                rcount++;
            }
            if(arr[i]=='L'){
                lcount++;
            }
            if(rcount==lcount){
                rcount=lcount=0;
                count++;
            }

        }
        return count;
    }
}