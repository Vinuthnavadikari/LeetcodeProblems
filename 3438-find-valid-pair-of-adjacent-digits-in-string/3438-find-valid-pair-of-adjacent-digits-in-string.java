class Solution {
    public String findValidPair(String s) {
      int frq[]=new int[10];
      for(char c:s.toCharArray()){
        frq[c-'0']++;
      }
      for(int i=0;i<s.length()-1;i++){
        int a=s.charAt(i)-'0';
        int b=s.charAt(i+1)-'0';
        if(a!=b && a==frq[a] && b==frq[b]){
            return ""+s.charAt(i)+s.charAt(i+1);
        }
      }
      
        return "";
        }
    }
