class Solution
{
    long minNum(long A[], int N)
    {
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=(int)A[i];
        }
        if(sum%2==0){
            return 2;
        }else return 1;
    }
}
