class Solution {
    public String interpret(String command) {
        // StringBuilder s=new StringBuilder();
        // int n=command.length();
        // for(int i=0;i<n;i++){
        //     char curr=command.charAt(i);
        //     if(curr=='G'){
        //         s.append('G');
        //     }
        //     else if(curr == '('){
        //         if(i+1<n && command.charAt(i+1) == ')'){
        //             s.append("o");
        //             i++;
        //         }
        //         else if(i+3<n && command.substring(i,i+4).equals("(al)")){
        //             s.append("al");
        //             i+=3;

        //         }
        //     }
        // }
        // return s.toString();
        String s=command.replace("()","o");
        String r=s.replace("(al)","al");
        return r;
        
    }
}