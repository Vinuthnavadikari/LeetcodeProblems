class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        for(int i=w;i>=1;i--){
            if(area%i==0){
                return new int[]{area/i,i};
            }
        }
        return new int[]{area,1};
        
    }
}