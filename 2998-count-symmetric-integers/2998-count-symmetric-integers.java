class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i)){
                count++;
            }
        }
        return count;
    }
    private boolean isSymmetric(int num){
        String s=String.valueOf(num);
        int l=s.length();
        if(l%2!=0)return false;
        int half=l/2;
        int sum1=0,sum2=0;
        for(int i=0;i<half;i++){
            sum1+=s.charAt(i)-'0';
        }
        for(int i=half;i<l;i++){
            sum2+=s.charAt(i)-'0';
        }
        return sum1==sum2;

    }
}