class Solution {
    static long leftShops(long i, long L){
        //for expontential purpose multiply the base with base till power time
        int temp=2;
        for(int j=1;j<L;j++){
            temp=temp*2;
        }
        temp-=i;
        return temp;
    }
}
