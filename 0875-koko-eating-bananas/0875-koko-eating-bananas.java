class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canEat(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    static boolean canEat(int piles[],int h,int s){
        long hours=0;
        for(int pile:piles){
            hours+=(pile+(long)s-1)/s;
        }
        return hours<=h;
    }
}