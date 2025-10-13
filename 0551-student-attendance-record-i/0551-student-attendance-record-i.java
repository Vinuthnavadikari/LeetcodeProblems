class Solution {
    public boolean checkRecord(String s) {
        char arr[]=s.toCharArray();
        int a=0;
        int b=0;
        for(char c:arr){
            if(c=='A'){
                a++;
                if(a>=2)return false;

            }
            if(c=='L'){
                b++;
                if(b>=3){return false;}
                

            }
            else{
                    b=0;
                }

        }
        return true;
        
    }
}