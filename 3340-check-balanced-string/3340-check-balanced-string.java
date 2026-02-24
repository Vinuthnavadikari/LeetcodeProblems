class Solution {
    public boolean isBalanced(String num) {
        int sume=0;
        int sumo=0;
        for(int i=0;i<num.length();i++){
          if(i%2==0){
            sume+=num.charAt(i)-'0';
          }
          else{
            sumo+=num.charAt(i)-'0';
          }
        }
        return sume==sumo;
        
        
    }
}