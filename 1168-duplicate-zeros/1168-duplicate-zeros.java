class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer>list=new ArrayList<>();
        for(int num:arr){
            list.add(num);
            if(num==0)list.add(0);
            if(list.size()>=arr.length)break;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
    }
}