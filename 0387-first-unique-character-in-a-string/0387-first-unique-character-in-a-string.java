class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character>seenOnce=new HashSet<>();
        HashSet<Character>seenMore=new HashSet<>();
        for(char c:s.toCharArray()){
            if(seenMore.contains(c)){
                continue;
            }
            if(seenOnce.contains(c)){
                seenOnce.remove(c);
                seenMore.add(c);
                
            }
            else{
                seenOnce.add(c);
            }

        }
        for(int i=0;i<s.length();i++){
            if(seenOnce.contains(s.charAt(i))){
                return i;
            }

        }
        return -1;
    }
}