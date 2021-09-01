class Complete{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
       int maxIndex=0;
       int minIndex=0;
       for(int i=1;i<n;i++){
           if(arr[i]>arr[maxIndex]){
               maxIndex=i;
           }
       }
       for(int i=1;i<m;i++){
           if(brr[i]<brr[minIndex]){
               minIndex=i;
           }
       }
       int product=arr[maxIndex]*brr[minIndex];
       return product;
    }
    
    
}
