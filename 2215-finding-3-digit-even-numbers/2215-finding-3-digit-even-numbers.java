class Solution {
    public int[] findEvenNumbers(int[] digits) {
       Set<Integer>result=new TreeSet<>();
       int n=digits.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(i==j || j==k||i==k)continue;
                int a=digits[i],b=digits[j],c=digits[k];
                if(a==0)continue;
                if(c%2!=0)continue;
                int num=a*100+b*10+c;
                result.add(num);
            }
        }
       }
       int[]ans=new int[result.size()];
       int i=0;
       for(int num:result){
        ans[i++]=num;
       }
       return ans;
       } 
    }
