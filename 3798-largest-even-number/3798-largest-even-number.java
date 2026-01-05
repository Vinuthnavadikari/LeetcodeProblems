class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=s.length()-1;i>=0;i--){
            int a=Integer.parseInt(s.charAt(i)+"");
            if(a%2==0){
                return sb.toString();
            }
            else{
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}