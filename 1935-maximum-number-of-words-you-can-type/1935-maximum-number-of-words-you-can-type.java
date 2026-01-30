class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       String arr[]=text.split(" ");
       HashSet<Character> s=new HashSet<>();
       for(char c:brokenLetters.toCharArray()){
        s.add(c);
       }
       int count=0;
       for(String word:arr){
        boolean canType=true;
        for(char c:word.toCharArray()){
            if(s.contains(c)){
                canType=false;
                break;
            }
        }
        if(canType){
            count++;
        }
       }
       return count;


    }
}