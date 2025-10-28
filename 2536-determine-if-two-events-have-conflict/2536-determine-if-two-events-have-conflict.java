class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1=toMinutes(event1[0]);
        int end1=toMinutes(event1[1]);
        int start2=toMinutes(event2[0]);
        int end2=toMinutes(event2[1]);
        return start1<=end2 && start2<=end1;

    }
    public int toMinutes(String time){
        String []t=time.split(":");
        return Integer.parseInt(t[0])*60+Integer.parseInt(t[1]);
    }
}