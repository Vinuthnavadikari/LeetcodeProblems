class Solution {
    public String maximumOddBinaryNumber(String s) {
        char arr[]=s.toCharArray();
        int count1=0;
        int count0=0;
        for(char a:arr){
            if(a=='1'){
                count1++;
            }
            else{
                count0++;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(count1-1!=0){
            sb.append("1");
            count1--;
        }
        while(count0!=0){
            sb.append("0");
            count0--;
        }
        sb.append("1");
        return sb.toString();
    }
}