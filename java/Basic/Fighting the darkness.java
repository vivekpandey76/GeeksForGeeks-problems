class Solution{
    long maxDays(long arr[], int n){
        int maximumNumberIndex=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[maximumNumberIndex]){
                maximumNumberIndex=i+1;
            }
        }
        long maximumNumberOfDays=arr[maximumNumberIndex];
        return maximumNumberOfDays;
    }
}
