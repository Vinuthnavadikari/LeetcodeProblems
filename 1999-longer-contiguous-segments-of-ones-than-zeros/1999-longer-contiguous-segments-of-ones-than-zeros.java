class Solution {
    public boolean checkZeroOnes(String s) {
        int count1=0;
        int count0=0;
        int max1=0;
        int max2=0;
      
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count1++;
                max1=Math.max(max1,count1);
            }
            else{
                count1=0;
               
            }
            if(s.charAt(i)=='0'){   
                    count0++;
                    max2=Math.max(max2,count0);  
            }
            else{
                count0=0;
                
            }
        }
        return max1>max2?true:false;


    }
}