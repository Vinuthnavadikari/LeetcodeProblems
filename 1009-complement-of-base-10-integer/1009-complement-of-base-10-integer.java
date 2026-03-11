class Solution {
    public int bitwiseComplement(int n) {
        int b=Integer.toBinaryString(n).length();
        return (1<<b)-1-n; 
    }
}