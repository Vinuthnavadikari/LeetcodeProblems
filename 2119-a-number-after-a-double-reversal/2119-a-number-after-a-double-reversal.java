class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0;
        int temp=num;
        while(num!=0){
            int digit=num%10;
            rev1=rev1*10+digit;
            num/=10;

        }
        int rev2=0;
        while(rev1!=0){
            int digit=rev1%10;
            rev2=rev2*10+digit;
            rev1/=10;
        }
        if(rev2!=temp){
            return false;
        }
       return true;

    }
}