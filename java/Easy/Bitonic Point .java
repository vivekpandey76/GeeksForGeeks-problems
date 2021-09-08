class Solution {
    int findMaximum(int[] arr, int n) {
       int maximumIndex=0;
       for(int i=0;i<n;i++){
           if(arr[i]>arr[maximumIndex]){
               maximumIndex=i;
           }
       }
       int maximumValue=arr[maximumIndex];
       return maximumValue;
    }
}
