class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currmass=mass;
        for(int a:asteroids){
            if(currmass<a){
                return false;
            }
            currmass+=a;
        }
        return true;

    }
}