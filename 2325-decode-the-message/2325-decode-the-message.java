class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();
        char curr='a';
        for(char c:key.toCharArray()){
            if(c!=' '&& !map.containsKey(c)){
                map.put(c,curr);
                curr++;
            }
        }
        StringBuilder result=new StringBuilder();
        for(char c:message.toCharArray()){
            if(c==' '){
                result.append(' ');
            }
            else{
                result.append(map.get(c));
            }
        }
        return result.toString();
        
    }
}