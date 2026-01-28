class Solution {
    public int splitNum(int num) {

        ArrayList<Integer> l=new ArrayList<>();
        while(num!=0){
            int digit=num%10;
            l.add(digit);
            num/=10;
        }
        Collections.sort(l);
        int num1=0;
        int num2=0;
        for(int i=0;i<l.size();i++){
            if(i%2==0){
                num1=num1*10+l.get(i);
            }
            else{
                num2=num2*10+l.get(i);
            }
        }
        return num1+num2;
    }
}