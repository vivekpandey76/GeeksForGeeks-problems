class Solution{

    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int temp;
            if(i==0 || i%2==0){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
     
        
    }
    
}
