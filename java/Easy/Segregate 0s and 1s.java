class Solution {
    void segregate0and1(int[] arr, int n) {
       int count=0;
       //Count the number of 0's and run the loop till 0 and insert value 0
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               count++;
           }
       }
       for(int i=0;i<count;i++){
           arr[i]=0;
       }
       for(int i=count;i<n;i++){
           arr[i]=1;
       }
       
       
    }

}
