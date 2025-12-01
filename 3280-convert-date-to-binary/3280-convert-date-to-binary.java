class Solution {
    public String convertDateToBinary(String date) {
        String []parts=date.split("-");
        int year=Integer.parseInt(parts[0]);
        int mon=Integer.parseInt(parts[1]);
        int da=Integer.parseInt(parts[2]);
        String y=Integer.toBinaryString(year);
        String m=Integer.toBinaryString(mon);
        String d=Integer.toBinaryString(da);
        return y+"-"+m+"-"+d;
    }
}