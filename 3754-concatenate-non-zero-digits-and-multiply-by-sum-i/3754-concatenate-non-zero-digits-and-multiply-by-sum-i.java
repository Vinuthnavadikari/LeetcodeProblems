class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
                
            }
        }
        if(sb.length()==0){
            return 0;
        }
        String str=sb.toString();
        long num=Long.parseLong(str);
        long temp=num;
        long sum=0;
        while(num>0){
            
            sum+=num%10;
            num/=10;
        }
        return sum*temp;


        
    }
}