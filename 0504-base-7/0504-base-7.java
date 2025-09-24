import java.math.BigInteger;
class Solution {
    public String convertToBase7(int num) {
        String s=Integer.toString(num);
        BigInteger n=new BigInteger(s);
        return n.toString(7);
    }
}