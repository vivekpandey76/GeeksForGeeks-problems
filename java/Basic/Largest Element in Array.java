package Basic;
class Compute {
    
    public long largest(long arr[], long n)
    {
       int max=(int)arr[0];
       for(int i=1;i<n;i++){
           if(arr[i]>max) max=(int)arr[i];
       }
       return max;
    }
}