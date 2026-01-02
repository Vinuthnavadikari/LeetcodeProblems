import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        // if (num1.equals("0") || num2.equals("0"))
        //     return "0";


        // int n1=Integer.parseInt(num1);
        // int n2=Integer.parseInt(num2);
        // int mul=n1*n2;
        // return Integer.toString(mul);
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return a.multiply(b).toString();
    }

}