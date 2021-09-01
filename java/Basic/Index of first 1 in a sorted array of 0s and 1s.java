class Compute {
    
    public long firstIndex(long arr[], long n)
    {
       int indexValue=0;
       for(int i=0;i<n;i++){
           int num=(int)arr[i];
           if(num==1){
               indexValue=i;
               break;
           }if(i==n-1 && i!=1){
               return -1;
           }
       }
       return indexValue;
    }
}
